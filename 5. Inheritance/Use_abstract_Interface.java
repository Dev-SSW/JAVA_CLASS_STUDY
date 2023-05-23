import java.util.*;
abstract class LottoGame
{
	int[] _numberArray = new int[5]; //로또 게임의 크기, 출력될 번호 배열 여러개
	//elementArray 배열의 크기 만큼 값을 받아서 저장하면 될 듯하다.
	
	int[] _elementArray; //생성되어야 할 숫자의 개수 , Num이 5라면 5만큼의 배열이 생성된다.
	int _elementNum = 0; // 숫자를 받아서 배열을 생성하기 위해 사용할 변수 
	
	
	int _setSize = 0;  //선택 가능한 최대 정수의 값 (45라면 1부터 45까지 랜덤 숫자가 생성
	
	LottoGame() {};
	LottoGame(int elementNum, int setSize)
	{
		this._elementNum = elementNum; // 배열 개수
		this._setSize = setSize;   //랜덤 최대 정수
		
	    this._elementArray = new int[_elementNum+1]; // 선택된 숫자만큼 배열을 만듦 + 보너스
	};
	public void _initialize(int array[])  //배열 초기화
	{
		for(int i =0; i<5; i++)
		{
			array[i] = 0;
		}
	}
	public void pickElements() 
	{
		for (int i = 0; i< _elementNum; i++) //배열의 개수만큼 반복
		{
			int check = 0; //같은 숫자가 있는지 체크
			int number = (int) (Math.random() * (_setSize-1) + 1); 
			for (int j = 0; j<_elementArray.length; j++)
			{
				if ( number == _elementArray[j])
				{
					check = 1;
				}
			}
			if (check != 1)
			{
				_elementArray[i] = number;
				//1부터 45까지 숫자를 랜덤하게 배열에 집어넣음
				//같은 숫자를 두 번까지만 받도록 추가해야한다.
			}
			else 
			{ //겹치는 숫자가 나왔을 때 다시 돌아가게 만들기
				i -= 1;
				continue;	
			}
		}
	}
}	
interface IbonusNumber
{
	public abstract int bonusNumber();
}
class LottoKNU extends LottoGame implements IbonusNumber
{
	public LottoKNU(int i, int j) {
		super(i,j);
	}
	@Override
	public int bonusNumber() {
		// TODO Auto-generated method stub
		int check = 0; //같은 숫자가 있는지 체크
		int number = (int) (Math.random() * (_setSize-1) + 1); 
		for (int j = 0; j<_elementArray.length; j++)
		{
			if ( number == _elementArray[j])
			{
				check = 1;
			}
		}
		if (check != 1) //겹치지 않으면
		{
			_elementArray[_elementNum] = number;
			//1부터 45까지 숫자를 랜덤하게 배열에 집어넣음
			//같은 숫자를 두 번까지만 받도록 추가해야한다.
		}
		else // 겹치면 
		{
			return -1;
		}
		return _elementArray[_elementNum];
	}
	public String toString()
	{
		String result = "";
		for (int j = 0; j<_elementNum + 1; j++)  //숫자 + 보너스
		{
				result += Integer.toString(_elementArray[j]);
				result += " ";
		}
		return result;
	}
}
public class Task
{
	public static void main(String[] args)
	{
		
		for (int i =0; i<5; i++)
		{
			LottoKNU lotto = new LottoKNU(6,45);
			lotto.pickElements();
			lotto.bonusNumber();
			if (lotto.bonusNumber() == -1)  //보너스 넘버가 겹쳤다고 나오면
			{
				while (lotto.bonusNumber() != -1)  //보너스 넘버가 겹치지 않을 때까지 반복
				{
					lotto.bonusNumber();
				}
			}
			System.out.print( "선택된 복권 번호 " + (i+1) + "번 : ");
			System.out.println(lotto.toString());

		}
	}
}

