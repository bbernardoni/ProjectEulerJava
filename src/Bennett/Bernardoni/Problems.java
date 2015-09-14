package Bennett.Bernardoni;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Problems {

	public Problems(){}
	
	public void problem1(){
		int z = 0;
		for(int i=1; i<1000; i++){
			if(i % 3 == 0 || i % 5 == 0){
				z+=i;
			}
		}
		System.out.println(z);
	}
	public void problem2(){
		int z = 0;
		int i = 1;
		int j = 2;
		int k = 2;
		while(j < 4000000){
			if(j % 2 == 0){
				z += j;
			}
			k = j;
			j += i;
			i = k;
		}
		System.out.println(z);
	}
	public void problem3(){
		long z = 600851475143L;
		for(int i = 3; i*i<z; i+=2){
			if(z % i == 0){
				z /= i;
			}
		}
		System.out.println(z);
	}
	public void problem4(){
		int z = 0;
		for(int i = 999; i > 900; i--){
			for(int j = 999; j > 900; j--){
				z = i*j;
				if(Sub.isPalindrome(""+z)){
					System.out.println(z);
				}
			}
		}
	}
	public void problem5(){
		int z = 1;
		for(int i = 2; i <= 20; i++){
			z *= i / Sub.gcd(z, i);
		}
		System.out.println(z);
	}
	public void problem6(){
		int x = 0;
		int y = 0;
		int z = 0;
		for(int i = 1; i<=100; i++){
			x += i;
		}
		x = x*x;
		for(int i = 1; i<=100; i++){
			y += i*i;
		}
		z = x - y;
		System.out.println(z);
	}
	public void problem7(){
		int z = 3;
		int i = 1;
		for(z = 3; i<10001; z+=2){
			if(Sub.isPrime(z)){
				i++;
			}
		}
		System.out.println(z-2);
	}
	public void problem8(){
		int z = 0;
		int x = 0;
		String nub =	"73167176531330624919225119674426574742355349194934" +
						"96983520312774506326239578318016984801869478851843" +
						"85861560789112949495459501737958331952853208805511" +
						"12540698747158523863050715693290963295227443043557" +
						"66896648950445244523161731856403098711121722383113" +
						"62229893423380308135336276614282806444486645238749" +
						"30358907296290491560440772390713810515859307960866" +
						"70172427121883998797908792274921901699720888093776" +
						"65727333001053367881220235421809751254540594752243" +
						"52584907711670556013604839586446706324415722155397" +
						"53697817977846174064955149290862569321978468622482" +
						"83972241375657056057490261407972968652414535100474" +
						"82166370484403199890008895243450658541227588666881" +
						"16427171479924442928230863465674813919123162824586" +
						"17866458359124566529476545682848912883142607690042" +
						"24219022671055626321111109370544217506941658960408" +
						"07198403850962455444362981230987879927244284909188" +
						"84580156166097919133875499200524063689912560717606" +
						"05886116467109405077541002256983155200055935729725" +
						"71636269561882670428252483600823257530420752963450";
		for(int i = 0; i < 996; i++){
			x = Character.getNumericValue(nub.charAt(i))*Character.getNumericValue(nub.charAt(i+1))*Character.getNumericValue(nub.charAt(i+2))
					*Character.getNumericValue(nub.charAt(i+3))*Character.getNumericValue(nub.charAt(i+4));
			z = Math.max(x, z);
		}
		System.out.println(z);
	}
	public void problem9(){
		int c = 0;
		int z = 0;
		for(int a = 0; a < 332; a++){
			for(int b = a + 1; b < (1000 - a - 1) / 2; b++){
				c = 1000 - a - b;
				if(a*a + b*b == c*c){
					z = a * b * c;
					System.out.println(z);
					break;
				}
			}
		}
	}
	public void problem10(){
		long z = 2;
		int i = 3;
		for(i = 3; i<2000000; i+=2){
			if(Sub.isPrime(i)){
				z += i;
			}
		}
		System.out.println(z);
	}
	public void problem11(){
		int z = 0;
		int x = 0;
		int n[][] ={{ 8,  2, 22, 97, 38, 15,  0, 40,  0, 75,  4,  5,  7, 78, 52, 12, 50, 77, 91,  8},
					{49, 49, 99, 40, 17, 81, 18, 57, 60, 87, 17, 40, 98, 43, 69, 48,  4, 56, 62,  0},
					{81, 49, 31, 73, 55, 79, 14, 29, 93, 71, 40, 67, 53, 88, 30,  3, 49, 13, 36, 65},
					{52, 70, 95, 23,  4, 60, 11, 42, 69, 24, 68, 56,  1, 32, 56, 71, 37,  2, 36, 91},
					{22, 31, 16, 71, 51, 67, 63, 89, 41, 92, 36, 54, 22, 40, 40, 28, 66, 33, 13, 80},
					{24, 47, 32, 60, 99,  3, 45,  2, 44, 75, 33, 53, 78, 36, 84, 20, 35, 17, 12, 50},
					{32, 98, 81, 28, 64, 23, 67, 10, 26, 38, 40, 67, 59, 54, 70, 66, 18, 38, 64, 70},
					{67, 26, 20, 68,  2, 62, 12, 20, 95, 63, 94, 39, 63,  8, 40, 91, 66, 49, 94, 21},
					{24, 55, 58,  5, 66, 73, 99, 26, 97, 17, 78, 78, 96, 83, 14, 88, 34, 89, 63, 72},
					{21, 36, 23,  9, 75,  0, 76, 44, 20, 45, 35, 14,  0, 61, 33, 97, 34, 31, 33, 95},
					{78, 17, 53, 28, 22, 75, 31, 67, 15, 94,  3, 80,  4, 62, 16, 14,  9, 53, 56, 92},
					{16, 39,  5, 42, 96, 35, 31, 47, 55, 58, 88, 24,  0, 17, 54, 24, 36, 29, 85, 57},
					{86, 56,  0, 48, 35, 71, 89,  7,  5, 44, 44, 37, 44, 60, 21, 58, 51, 54, 17, 58},
					{19, 80, 81, 68,  5, 94, 47, 69, 28, 73, 92, 13, 86, 52, 17, 77,  4, 89, 55, 40},
					{ 4, 52,  8, 83, 97, 35, 99, 16,  7, 97, 57, 32, 16, 26, 26, 79, 33, 27, 98, 66},
					{88, 36, 68, 87, 57, 62, 20, 72,  3, 46, 33, 67, 46, 55, 12, 32, 63, 93, 53, 69},
					{ 4, 42, 16, 73, 38, 25, 39, 11, 24, 94, 72, 18,  8, 46, 29, 32, 40, 62, 76, 36},
					{20, 69, 36, 41, 72, 30, 23, 88, 34, 62, 99, 69, 82, 67, 59, 85, 74,  4, 36, 16},
					{20, 73, 35, 29, 78, 31, 90,  1, 74, 31, 49, 71, 48, 86, 81, 16, 23, 57,  5, 54},
					{ 1, 70, 54, 71, 83, 51, 54, 69, 16, 92, 33, 48, 61, 43, 52,  1, 89, 19, 67, 48}};
		for(int i = 0; i < 17; i++){
			for(int j = 0; j < 20; j++){
				x = n[i][j] * n[i+1][j] * n[i+2][j] * n[i+3][j];
				z = Math.max(x, z);
			}
		}
		for(int i = 0; i < 20; i++){
			for(int j = 0; j < 17; j++){
				x = n[i][j] * n[i][j+1] * n[i][j+2] * n[i][j+3];
				z = Math.max(x, z);
			}
		}
		for(int i = 0; i < 17; i++){
			for(int j = 0; j < 17; j++){
				x = n[i][j] * n[i+1][j+1] * n[i+2][j+2] * n[i+3][j+3];
				z = Math.max(x, z);
			}
		}
		for(int i = 0; i < 17; i++){
			for(int j = 3; j < 20; j++){
				x = n[i][j] * n[i+1][j-1] * n[i+2][j-2] * n[i+3][j-3];
				z = Math.max(x, z);
			}
		}
		System.out.println(z);
	}
	public void problem12(){
		int z = 0;
		int x = 2;
		for(int i = 1; x <= 500; i++){
			z += i;
			x = 2;
			for(int j = 2; j*j <= z; j++){
				if(z % j == 0){
					x+=(j*j == z? 1:2);
				}
			}
		}
		System.out.println(z);
	}
	public void problem13(){
		long z = 0;
		String nubs[] ={"37107287533902102798797998220837590246510135740250",
						"46376937677490009712648124896970078050417018260538",
						"74324986199524741059474233309513058123726617309629",
						"91942213363574161572522430563301811072406154908250",
						"23067588207539346171171980310421047513778063246676",
						"89261670696623633820136378418383684178734361726757",
						"28112879812849979408065481931592621691275889832738",
						"44274228917432520321923589422876796487670272189318",
						"47451445736001306439091167216856844588711603153276",
						"70386486105843025439939619828917593665686757934951",
						"62176457141856560629502157223196586755079324193331",
						"64906352462741904929101432445813822663347944758178",
						"92575867718337217661963751590579239728245598838407",
						"58203565325359399008402633568948830189458628227828",
						"80181199384826282014278194139940567587151170094390",
						"35398664372827112653829987240784473053190104293586",
						"86515506006295864861532075273371959191420517255829",
						"71693888707715466499115593487603532921714970056938",
						"54370070576826684624621495650076471787294438377604",
						"53282654108756828443191190634694037855217779295145",
						"36123272525000296071075082563815656710885258350721",
						"45876576172410976447339110607218265236877223636045",
						"17423706905851860660448207621209813287860733969412",
						"81142660418086830619328460811191061556940512689692",
						"51934325451728388641918047049293215058642563049483",
						"62467221648435076201727918039944693004732956340691",
						"15732444386908125794514089057706229429197107928209",
						"55037687525678773091862540744969844508330393682126",
						"18336384825330154686196124348767681297534375946515",
						"80386287592878490201521685554828717201219257766954",
						"78182833757993103614740356856449095527097864797581",
						"16726320100436897842553539920931837441497806860984",
						"48403098129077791799088218795327364475675590848030",
						"87086987551392711854517078544161852424320693150332",
						"59959406895756536782107074926966537676326235447210",
						"69793950679652694742597709739166693763042633987085",
						"41052684708299085211399427365734116182760315001271",
						"65378607361501080857009149939512557028198746004375",
						"35829035317434717326932123578154982629742552737307",
						"94953759765105305946966067683156574377167401875275",
						"88902802571733229619176668713819931811048770190271",
						"25267680276078003013678680992525463401061632866526",
						"36270218540497705585629946580636237993140746255962",
						"24074486908231174977792365466257246923322810917141",
						"91430288197103288597806669760892938638285025333403",
						"34413065578016127815921815005561868836468420090470",
						"23053081172816430487623791969842487255036638784583",
						"11487696932154902810424020138335124462181441773470",
						"63783299490636259666498587618221225225512486764533",
						"67720186971698544312419572409913959008952310058822",
						"95548255300263520781532296796249481641953868218774",
						"76085327132285723110424803456124867697064507995236",
						"37774242535411291684276865538926205024910326572967",
						"23701913275725675285653248258265463092207058596522",
						"29798860272258331913126375147341994889534765745501",
						"18495701454879288984856827726077713721403798879715",
						"38298203783031473527721580348144513491373226651381",
						"34829543829199918180278916522431027392251122869539",
						"40957953066405232632538044100059654939159879593635",
						"29746152185502371307642255121183693803580388584903",
						"41698116222072977186158236678424689157993532961922",
						"62467957194401269043877107275048102390895523597457",
						"23189706772547915061505504953922979530901129967519",
						"86188088225875314529584099251203829009407770775672",
						"11306739708304724483816533873502340845647058077308",
						"82959174767140363198008187129011875491310547126581",
						"97623331044818386269515456334926366572897563400500",
						"42846280183517070527831839425882145521227251250327",
						"55121603546981200581762165212827652751691296897789",
						"32238195734329339946437501907836945765883352399886",
						"75506164965184775180738168837861091527357929701337",
						"62177842752192623401942399639168044983993173312731",
						"32924185707147349566916674687634660915035914677504",
						"99518671430235219628894890102423325116913619626622",
						"73267460800591547471830798392868535206946944540724",
						"76841822524674417161514036427982273348055556214818",
						"97142617910342598647204516893989422179826088076852",
						"87783646182799346313767754307809363333018982642090",
						"10848802521674670883215120185883543223812876952786",
						"71329612474782464538636993009049310363619763878039",
						"62184073572399794223406235393808339651327408011116",
						"66627891981488087797941876876144230030984490851411",
						"60661826293682836764744779239180335110989069790714",
						"85786944089552990653640447425576083659976645795096",
						"66024396409905389607120198219976047599490197230297",
						"64913982680032973156037120041377903785566085089252",
						"16730939319872750275468906903707539413042652315011",
						"94809377245048795150954100921645863754710598436791",
						"78639167021187492431995700641917969777599028300699",
						"15368713711936614952811305876380278410754449733078",
						"40789923115535562561142322423255033685442488917353",
						"44889911501440648020369068063960672322193204149535",
						"41503128880339536053299340368006977710650566631954",
						"81234880673210146739058568557934581403627822703280",
						"82616570773948327592232845941706525094512325230608",
						"22918802058777319719839450180888072429661980811197",
						"77158542502016545090413245809786882778948721859617",
						"72107838435069186155435662884062257473692284509516",
						"20849603980134001723930671666823555245252804609722",
						"53503534226472524250874054075591789781264330331690"};
		for(int i = 0; i < nubs.length; i++){
			z += Long.parseLong(nubs[i].substring(0, 15));
		}
		System.out.println(z/10000000);
	}
	public void problem14(){
		int z = 0;
		int w = 0;
		int y = 1;
		long x = 0;
		for(int i = 2; i < 1000000; i++){
			x = i;
			y = 1;
			while(x!=1){
				x = (x % 2 == 0? x / 2 : 3 * x + 1);
				y++;
			}
			if(y>w){
				z = i;
				w = y;
			}
		}
		System.out.println(z);
	}
	public void problem15(){
		// 40!/(20!*20!) = 137846528820
		// 34!/(17!*17!) = 2333606220
		//long z = problem15rd(0, 0, 0);
		long z = Sub.choose(40L, 20L);
		System.out.println(z);
	}
	public long problem15rd(int r, int d, long nub){
		if(r == 17 || d == 17){
			return nub + 1;
		}
		nub = problem15rd(r + 1, d, nub);
		nub = problem15rd(r, d + 1, nub);
		return nub;
	}
	public void problem16(){
		int z = 0;
		BigInteger n = BigInteger.ONE;
		for(int i = 1; i <= 1000; i++){
			n = n.multiply(BigInteger.valueOf(2));
		}
		String s = n.toString();
		for(int i = 0; i < s.length(); i++){
			z += Character.getNumericValue(s.charAt(i));
		}
		System.out.println(z);
	}
	public void problem17(){
		int z = 0;
		int ones[] = {0, 3, 3, 5, 4, 4, 3, 5, 5, 4};
		int tens[] = {0, 3, 6, 6, 5, 5, 5, 7, 6, 6};
		int hundreds[] = {0, 13, 13, 15, 14, 14, 13, 15, 15, 14};
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				for(int k = 0; k < 10; k++){
					z += ones[k] + tens[j] + hundreds[i];
				}
			}
			z += 1;
		}
		z += 14;
		System.out.println(z);
	}
	public void problem18(){
		int z = 0;
		int nubs[][] = {{75},
						{95, 64},
						{17, 47, 82},
						{18, 35, 87, 10},
						{20,  4, 82, 47, 65},
						{19,  1, 23, 75,  3, 34},
						{88,  2, 77, 73,  7, 63, 67},
						{99, 65,  4, 28,  6, 16, 70, 92},
						{41, 41, 26, 56, 83, 40, 80, 70, 33},
						{41, 48, 72, 33, 47, 32, 37, 16, 94, 29},
						{53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14},
						{70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57},
						{91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48},
						{63, 66,  4, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31},
						{04, 62, 98, 27, 23,  9, 70, 98, 73, 93, 38, 53, 60,  4, 23}};
		z = problem18rd(0, 0, 0, nubs);
		System.out.println(z);
	}
	public int problem18rd(int r, int d, int nub, int nubs[][]){
		if(d == 14){
			return nub + nubs[14][r];
		}
		int x = problem18rd(r + 1, d + 1, nub + nubs[d][r], nubs);
		int y = problem18rd(r, d + 1, nub + nubs[d][r], nubs);
		return Math.max(x, y);
	}
	public void problem19(){
		int z = 0;
		int d = 2;
		for(int i = 1; i <= 100; i++){
			for(int j = 1; j <= 12; j++){
				for(int k = 1; k <= 31; k++){
					if(k==1&&d==0){
						z++;
					}
					d = (d + 1) % 7;
					if((j==4||j==6||j==9||j==11)&&k==30){
						k = 31;
					}
					if(j==2&&k==(i%4==0?29:28)){
						k = 31;
					}
				}
			}
		}
		
		System.out.println(z);
	}
	public void problem20(){
		int z = 0;
		BigInteger n = BigInteger.ONE;
		for(int i = 2; i <= 100; i++){
			n = n.multiply(BigInteger.valueOf(i));
		}
		String s = n.toString();
		for(int i = 0; i < s.length(); i++){
			z += Character.getNumericValue(s.charAt(i));
		}
		System.out.println(z);
	}
	public void problem21(){
		int z = 0;
		int x = 1;
		int y = 1;
		for(int i = 2; i < 10000; i++){
			x = Sub.sumOfFactors(i) - i;
			y = Sub.sumOfFactors(x) - x;
			if(y == i && i != x){
				z += i;
			}
		}
		System.out.println(z);
	}
	public void problem22(){
		int z = 0;
		int x = 0;
		ArrayList<String> names = new ArrayList<String>();
		try {
			FileInputStream is = new FileInputStream(getClass().getResource("names.txt").getPath());
			boolean reading = false;
			char in = ' ';
			String name = "";
			while(Character.isDefined(in)){
				in = (char)is.read();
				if(in=='\"'){
					if(reading){
						names.add(name);
						name = "";
					}
					reading = !reading;
				}else if(reading){
					name = name + in;
				}
			}
			is.close();
		} catch (IOException e) {e.printStackTrace();}
		Collections.sort(names);
		for(int i = 0; i < names.size(); i++){
			for(int j = 0; j < names.get(i).length(); j++){
				x += names.get(i).charAt(j) - 64;
			}
			z += (i+1) * x;
			x = 0;
		}
		System.out.println(z);
	}
	public void problem23(){
		int z = 0;
		int x = 1;
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i = 12; i <= 28123; i++){
			x = Sub.sumOfFactors(i) - i;
			if(x > i){
				a.add(i);
			}
		}
		for(int i = 1; i <= 28123; i++){
			x=0;
			for(int j = 0; a.get(j)*2 <= i; j++){
				if(a.contains(i-a.get(j))){
					x=1;
					break;
				}
			}
			if(x==0){
				z += i;
			}
			//System.out.println(i);
		}
		System.out.println(z);
	}
	public void problem24(){
		long z = 0;
		int x = 1000000 - 1;
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i = 0; i<10; i++){
			a.add(i);
		}
		for(int i = 9; i>= 0; i--){
			int y = 0;
			while(Sub.factorial(i) <= x){
				y++;
				x -= Sub.factorial(i);
			}
			z = (z * 10) + a.remove(y);
		}
		System.out.println(z);
	}
	public void problem25(){
		long z = 2;
		BigInteger i = BigInteger.ONE;
		BigInteger j = i;
		BigInteger k;
		BigInteger t = BigInteger.TEN.pow(999);
		while(j.compareTo(t)<0){
			k = j;
			j = j.add(i);
			i = k;
			z++;
		}
		System.out.println(z);
	}
	public void problem26(){
		int z = 0;
		int w = 0;
		BigInteger x = BigInteger.valueOf(9);
		int y = 1;
		for(int i = 2; i < 1000; i++){
			if(i%2==0||i%5==0){
				continue;
			}
			x = BigInteger.valueOf(9);
			y = 1;
			while(!x.mod(BigInteger.valueOf(i)).equals(BigInteger.ZERO)){
				x = x.multiply(BigInteger.TEN).add(BigInteger.valueOf(9));
				y++;
			}
			if(y > w){
				w = y;
				z = i;
			}
		}
		System.out.println(z);
	}
	public void problem27(){
		int z = 0;
		int n = 0;
		int x = 0;
		ArrayList<Integer> p = new ArrayList<Integer>();
		for(int j = 2; j < 1000; j++){
			if(Sub.isPrime(j)){
				p.add(j);
			}
		}
		int w = 0;
		for(int i = 1000; i > -999; i--){
			for(int j : p){
				n = 0;
				w = n*(n+i)+j;
				while(Sub.isPrime(w)&&w>0){
					n++;
					w = n*(n+i)+j;
				}
				if(x<n){
					x = n;
					z = i*j;
				}
			}
		}
		System.out.println(z);
	}
	public void problem28(){
		long z = 1;
		long n = 1;
		for(int i = 2; i <= 1000; i+=2){
			n+=i;
			z+=n;
			n+=i;
			z+=n;
			n+=i;
			z+=n;
			n+=i;
			z+=n;
		}
		System.out.println(z);
	}
	public void problem29(){
		int max = 100;
		int z = 0;
		BigInteger s;
		BigInteger x;
		ArrayList<Integer> n = new ArrayList<Integer>();
		ArrayList<Integer> d = new ArrayList<Integer>();
		ArrayList<Integer> ss = new ArrayList<Integer>();
		for(int i = 2; i*i<=max; i++){
			if(i==4||i==8||i==9){
				continue;
			}
			for(int j = 1; Math.pow(i, j)<=max; j++){
				n.add((int) Math.pow(i, j));
				d.add(2);
			}
			while(n.size()>1){
				ss.clear();
				ss.add(0);
				s = BigInteger.valueOf(n.get(0)).pow(d.get(0));
				for(int j = 1; j < n.size(); j++){
					x = BigInteger.valueOf(n.get(j)).pow(d.get(j));
					if(x.compareTo(s) < 0){
						s = x;
						ss.clear();
						ss.add(j);
					}else if(x.equals(s)){
						ss.add(j);
					}
				}
				z += ss.size() - 1;
				for(int j = ss.size()-1; j >= 0; j--){
					d.set(ss.get(j), d.get(ss.get(j))+1);
					if(d.get(ss.get(j))>max){
						n.remove((int)ss.get(j));
						d.remove((int)ss.get(j));
					}
				}
			}
			n.clear();
			d.clear();
		}
		System.out.println((max-1)*(max-1)-z);
	}
	/*
	int max = 100;
	int z = 0;
	ArrayList<Integer> n = new ArrayList<Integer>();
	ArrayList<Integer> m = new ArrayList<Integer>();
	for(int i = 2; i*i<=max; i++){
		if(i==4||i==8||i==9){
			continue;
		}
		for(int j = 1; Math.pow(i, j)<=max; j++){
			n.add((int) Math.pow(i, j));
			m.add(2);
		}
		BigInteger x;
		int y = 0;
		while(m.size()>1){
			m.set(y, m.get(y)+1);
			x = BigInteger.valueOf(n.get(y)).pow(m.get(y));
			for(int j = 0; j<m.size(); j++){
				if(y==j){
					continue;
				}
				BigInteger c = BigInteger.valueOf(n.get(j)).pow(m.get(j));
				if(c.equals(x)){
					z++;
				}else if(c.compareTo(x)<0){
					y = j;
				}
			}
			if(m.get(0)>=max){
				m.remove(0);
			}
		}
		n.clear();
		m.clear();
	}
	System.out.println((max-1)*(max-1)-z);
	*/
	public void problem30(){
		int z = 0;
		long x;
		String s;
		int f[] = {0, 1, 32, 243, 1024, 3125, 7776, 16807, 32768, 59049};
		for(int i = 10; i < 200000; i++){
			x = 0;
			s = String.valueOf(i);
			for(int j = 0; j < s.length(); j++){
				x += f[Character.getNumericValue(s.charAt(j))];
			}
			if(x == i){
				z += i;
			}
		}
		System.out.println(z);
	}
	public void problem31(){
		int z = 1;
		for(int i = 0; i<=200; i+=100){
			for(int j = 0; j+i<=200; j+=50){
				for(int k = 0; k+i+j<=200; k+=20){
					for(int l = 0; l+i+j+k<=200; l+=10){
						for(int m = 0; m+i+j+k+l<=200; m+=5){
							for(int n = 0; n+i+j+k+l+m<=200; n+=2){
								for(int o = 0; o+i+j+k+l+m+n<=200; o++){
									if(i+j+k+l+m+n+o == 200){
										z++;
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(z);
	}
	public void problem32(){
		int z = 0;
		int x, y;
		ArrayList<Integer> n = new ArrayList<Integer>();
		ArrayList<Integer> d = new ArrayList<Integer>();
		for(int i = 1; i < 9; i++){
			y = i;
			for(int j = 0; j < 1680; j++){
				for(int k = 1; k < 10; k++){
					d.add(k);
				}
				d.remove(y-1);
				x = d.remove(j/(5*6*7))*1000 + d.remove((j%(5*6*7))/(5*6))*100 + d.remove((j%(5*6))/5)*10 + d.remove(j%5);
				if(		(""+y*x).contains(""+d.remove(0)) &&
						(""+y*x).contains(""+d.remove(0)) &&
						(""+y*x).contains(""+d.remove(0)) &&
						(""+y*x).contains(""+d.remove(0)) &&
						(""+y*x).length() == 4 &&
						!n.contains(y*x)){
					n.add(y*x);
				}
				d.clear();
			}
		}
		for(int i = 0; i < 72; i++){
			for(int k = 1; k < 10; k++){
				d.add(k);
			}
			y = d.remove(i/8)*10 + d.remove(i%8);
			d.clear();
			for(int j = 0; j < 210; j++){
				for(int k = 1; k < 10; k++){
					d.add(k);
				}
				d.remove(i/8);
				d.remove(i%8);
				x = d.remove(j/(5*6))*100 + d.remove((j%(5*6))/5)*10 + d.remove(j%5);
				if(		(""+y*x).contains(""+d.remove(0)) &&
						(""+y*x).contains(""+d.remove(0)) &&
						(""+y*x).contains(""+d.remove(0)) &&
						(""+y*x).contains(""+d.remove(0)) &&
						(""+y*x).length() == 4 &&
						!n.contains(y*x)){
					n.add(y*x);
				}
				d.clear();
			}
		}
		for(int i = 0; i < n.size(); i++){
			z += n.get(i);
		}
		System.out.println(z);
	}
	public void problem33(){
		int x, y;
		ArrayList<Integer> n = new ArrayList<Integer>();
		for(int i = 12; i < 100; i++){
			if(i%10 == 0){
				continue;
			}
			for(int j = 11; j < i; j++){
				if(j%10 == 0){
					continue;
				}
				if(i/10 == j/10){
					x = i%10;
					y = j%10;
				}else if(i/10 == j%10){
					x = i%10;
					y = j/10;
				}else if(i%10 == j/10){
					x = i/10;
					y = j%10;
				}else if(i%10 == j%10){
					x = i/10;
					y = j/10;
				}else{
					continue;
				}
				if((float)j/i == (float)y/x && (float)j/i < 1){
					n.add(y);
					n.add(x);
				}
			}
		}
		y = n.get(0) * n.get(2) * n.get(4) * n.get(6);
		x = n.get(1) * n.get(3) * n.get(5) * n.get(7);
		for(int i = 2; i*i < y; i++){
			while(y%i==0 && x%i==0){
				y/=i;
				x/=i;
			}
		}
		System.out.println(x);
	}
	public void problem34(){
		int z = 0;
		long x;
		String s;
		int f[] = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 352880};
		for(int i = 10; i < 41000; i++){
			x = 0;
			s = String.valueOf(i);
			for(int j = 0; j < s.length(); j++){
				x += f[Character.getNumericValue(s.charAt(j))];
			}
			if(x == i){
				z += i;
			}
		}
		System.out.println(z);
	}
	public void problem35(){
		int z = 1;
		int x = 0;
		int y = 0;
		for(int i = 3; i < 1000000; i+=2){
			x = (int) Math.log10(i) + 1;
			for(int j = 1; j < x; j++){
				if(((i%(int)Math.pow(10, j+1)) / (int)Math.pow(10, j)) % 2 == 0){
					i += (int) Math.pow(10, j);
				}
			}
			y = 0;
			for(int j = 0; j < x; j++){
				if(Sub.isPrime(i)){
					y++;
				}
				i = (i*10) % (int)Math.pow(10, x) + i/(int)Math.pow(10, x-1);
			}
			if(y == x){
				z++;
			}
		}
		System.out.println(z);
	}
	public void problem36(){
		int z = 0;
		for(int i = 1; i < 1000000; i++){
			if(!Sub.isPalindrome(""+i)){
				continue;
			}
			if(Sub.isPalindrome(Integer.toBinaryString(i))){
				z+=i;
			}
		}
		System.out.println(z);
	}
	public void problem37(){
		int z = 0;
		int x;
		int y = 0;
		loop: for(int i = 11; y < 11; i+=2){
			x = (int) Math.log10(i) + 1;
			for(int j = 1; j < x; j++){
				if(((i%(int)Math.pow(10, j+1)) / (int)Math.pow(10, j)) % 2 == 0 && i / (int)Math.pow(10, x-1) != 2){
					i += (int) Math.pow(10, j);
				}
			}
			if(!Sub.isPrime(i)){
				continue;
			}
			for(int j = 1; j < x; j++){
				if(!Sub.isPrime(i / (int)Math.pow(10, j))){
					continue loop;
				}
			}
			for(int j = 1; j < x; j++){
				if(!Sub.isPrime(i % (int)Math.pow(10, j))){
					continue loop;
				}
			}
			z += i;
			y++;
		}
		System.out.println(z);
	}
	public void problem38(){
		int z = 0;
		int x;
		String y;
		for(int i = 0; i < 10000; i++){
			y = "";
			for(int j = 1; y.length() < 9; j++){
				y += "" + (i*j);
			}
			if(y.length()!=9){
				continue;
			}
			x = 0;
			for(int j = 1; j < 10; j++){
				if(y.contains(""+j)){
					x++;
				}
			}
			if(x==9){
				z = Math.max(z, Integer.parseInt(y));
			}
		}
		System.out.println(z);
	}
	public void problem39(){
		int z = 0;
		int x = 0;
		int n[] = new int[1000];
		for(int i = 0; i < n.length; i++){
			n[i] = 0;
		}
		for(int i = 3; i < 500; i++){
			for(int j = i+1; j < 500; j++){
				for(int k = j+1; k < 500; k++){
					if(i*i+j*j == k*k){
						if(i+j+k <= 1000){
							n[i+j+k-1]++;
						}
					}
				}
			}
		}
		for(int i = 0; i < n.length; i++){
			if(n[i] > x){
				x = n[i];
				z = i+1;
			}
		}
		System.out.println(z);
	}
	public void problem40(){
		int z = 1;
		int y = 0;
		int x = 0;
		for(int i = 1; y < 7; i++){
			x += (int) Math.log10(i) + 1;
			if(x>=(int)Math.pow(10, y)){
				int w = x - (int)Math.pow(10, y);
				z *= i%(int)Math.pow(10, w+1) / (int)Math.pow(10, w);
				y++;
			}
		}
		System.out.println(z);
	}
	public void problem41(){
		int z = 0;
		int x = 0;
		int n = 7;
		int i[] = new int[n];
		i[n-1] = 0;
		ArrayList<Integer> d = new ArrayList<Integer>();
		for(i[0] = 0; i[0] < n; i[0]++){
			for(i[1] = 0; i[1] < n-1; i[1]++){
				for(i[2] = 0; i[2] < n-2; i[2]++){
					for(i[3] = 0; i[3] < n-3; i[3]++){
						for(i[4] = 0; i[4] < n-4; i[4]++){
							for(i[5] = 0; i[5] < n-5; i[5]++){
								for(int j = 1; j < n+1; j++){
									d.add(j);
								}
								x = 0;
								for(int j = 0; j < n; j++){
									x = x*10 + d.remove(i[j]);
								}
								if(x>z){
									if(Sub.isPrime(x)){
										z = x;
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(z);
	}
	public void problem42(){
		int z = 0;
		int x = 0;
		int t[] = {1,3,6,10,15,21,28,36,45,55,66,78,91,105,120,136,153,171,190,210};
		ArrayList<String> words = new ArrayList<String>();
		try {
			FileInputStream is = new FileInputStream(getClass().getResource("words.txt").getPath());
			boolean reading = false;
			char in = ' ';
			String word = "";
			while(Character.isDefined(in)){
				in = (char)is.read();
				if(in=='\"'){
					if(reading){
						words.add(word);
						word = "";
					}
					reading = !reading;
				}else if(reading){
					word += in;
				}
			}
			is.close();
		} catch (IOException e) {e.printStackTrace();}
		for(int i = 0; i < words.size(); i++){
			for(int j = 0; j < words.get(i).length(); j++){
				x += words.get(i).charAt(j) - 64;
			}
			for(int j = 0; t[j] <= x; j++){
				if(t[j]==x){
					z++;
				}
			}
			x = 0;
		}
		System.out.println(z);
	}
	public void problem43(){
		long z = 0;
		long x;
		int y;
		int n[] = {2,3,5,7,11,13,17};
		int i[] = new int[10];
		i[9] = 0;
		ArrayList<Integer> d = new ArrayList<Integer>();
		for(i[0] = 0; i[0] < 10; i[0]++){
			for(i[1] = 0; i[1] < 9; i[1]++){
				for(i[2] = 0; i[2] < 8; i[2]++){
					for(i[3] = 0; i[3] < 7; i[3]++){
						for(i[4] = 0; i[4] < 6; i[4]++){
							for(i[5] = 0; i[5] < 5; i[5]++){
								for(i[6] = 0; i[6] < 4; i[6]++){
									for(i[7] = 0; i[7] < 3; i[7]++){
										for(i[8] = 0; i[8] < 2; i[8]++){
											for(int j = 0; j < 10; j++){
												d.add(j);
											}
											x = 0;
											for(int j = 0; j < 10; j++){
												x = x*10 + d.remove(i[j]);
											}
											y = 0;
											for(int j = 6; j >= 0; j--){
												if((x%(int)Math.pow(10, j+3)/(int)Math.pow(10, j))%n[6-j]==0){
													y++;
												}else{
													break;
												}
											}
											if(y == 7){
												z += x;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(z);
	}
	public void problem44(){
		int z = 1000000000;
		int x,y,t;
		for(int i = 1; i <= 10000; i++){
			for(int j = 1; j < 10000; j++){
				x = j*(3*j-1)/2;
				y = (j+i)*(3*(j+i)-1)/2;
				if(y-x<z){
					t = (int) Math.sqrt((x+y)*24+1);
					if(t*t!=(x+y)*24+1||t%6!=5){
						continue;
					}
					t = (int) Math.sqrt((y-x)*24+1);
					if(t*t!=(y-x)*24+1||t%6!=5){
						continue;
					}
					z = y - x;
				}
			}
		}
		System.out.println(z);
	}
	public void problem45(){
		long z = 0;
		long t;
		boolean c = true;
		for(int i = 144; c; i++){
			z = i*(2*i-1);
			t = (long) Math.sqrt(z*24+1);
			if(t*t==z*24+1&&t%6==5){
				c = false;
			}
		}
		System.out.println(z);
	}
	public void problem46(){
		int z = 0;
		ArrayList<Integer> p = new ArrayList<Integer>();
		ArrayList<Integer> s = new ArrayList<Integer>();
		p.add(3);
		s.add(2);
		loop: for(int i = 9; true; i+=2){
			if(Sub.isPrime(i)){
				continue;
			}
			while(i>p.get(p.size()-1)){
				for(int j = p.get(p.size()-1)+2; true; j+=2){
					if(Sub.isPrime(j)){
						p.add(j);
						break;
					}
				}
			}
			while(i>s.get(s.size()-1)){
				s.add((s.size()+1)*(s.size()+1)*2);
			}
			for(int j = 0; j < p.size()-1; j++){
				for(int k = 0; k < s.size()-1; k++){
					if(p.get(j)+s.get(k) == i){
						continue loop;
					}
				}
			}
			z = i;
			break;
		}
		System.out.println(z);
	}
	public void problem47(){
		int z = 0;
		int x, y;
		loop: for(int i = 210; true; i++){
			for(int j = 0; j < 4; j++){
				x = 0;
				y = i + j;
				for(int k=2;y!=1;k++){
					if(y%k==0){
						x++;
					}
		            while(y%k==0){
		                y/=k;
		            }
		            if(k*k>y){
		            	x++;
		            	y=1;
		            }
		        }
				if(x!=4){
					i+=j;
					continue loop;
				}
			}
			z = i;
			break;
		}
		System.out.println(z);
	}
	public void problem48(){
		long z = 0;
		long x;
		long y = 10000000000L;
		for(int i = 1; i <= 1000; i++){
			x = 1;
			for(int j = 1; j <= i; j++){
				x *= i;
				x %= y;
			}
			z += x;
			z %= y;
		}
		System.out.println(z);
	}
	public void problem49(){
		ArrayList<Integer> p = new ArrayList<Integer>();
		for(int i = 1001; i < 10000; i+=2){
			if(Sub.isPrime(i)){
				p.add(i);
			}
		}
		for(int i = 0; i < p.size() - 2; i++){
			loop: for(int j = i+1; j < p.size() - 1; j++){
				if(p.contains(2*p.get(j)-p.get(i))){
					int w = p.get(i);
					int x = p.get(j);
					int y = 2*p.get(j)-p.get(i);
					for(int k = 0; k < 4; k++){
						int d = w%(int)Math.pow(10, k+1) / (int)Math.pow(10, k);
						if(!(""+x).contains(""+d) || !(""+y).contains(""+d)){
							continue loop;
						}
						d = x%(int)Math.pow(10, k+1) / (int)Math.pow(10, k);
						if(!(""+w).contains(""+d) || !(""+y).contains(""+d)){
							continue loop;
						}
						d = y%(int)Math.pow(10, k+1) / (int)Math.pow(10, k);
						if(!(""+w).contains(""+d) || !(""+x).contains(""+d)){
							continue loop;
						}
					}
					System.out.println(""+w+x+y);
				}
			}
		}
	}
	public void problem50(){
		int z = 0;
		int x = 0;
		for(int i = 0; i <= 100; i+=2){
			if(!Sub.isPrime(i+3)){
				continue;
			}
			for(int j = 3; x < 1000000; j+=2){
				if(Sub.isPrime(i+j)){
					x += i+j;
					if(Sub.isPrime(x) && x < 1000000){
						z = Math.max(z, x);
					}
				}
			}
			x = 0;
		}
		System.out.println(z);
	}
	public void problem51(){
		int z = 0;
		int x;
		String s;
		ArrayList<Integer> n = new ArrayList<Integer>();
		for(int i = 50001; i<2090021; i+=2){
			if(!Sub.isPrime(i)){
				continue;
			}
			s = ""+i;
			if(!s.contains("1")){
				continue;
			}
			n.clear();
			for(int j = 0; j < s.length(); j++){
				if(s.charAt(j)=='1'){
					n.add(j);
				}
			}
			for(int j = 1; j < Math.pow(2, n.size()); j++){
				x = 1;
				s = ""+i;
				for(int k = 2; k < 10; k++){
					StringBuilder sb = new StringBuilder(s);
					for(int l = 0; l < n.size(); l++){
						if((j&(1<<l))!=0){
							sb.setCharAt(n.get(l), (char)(k+48));
							s = sb.toString();
						}
					}
					if(Sub.isPrime(Integer.parseInt(s))){
						x++;
					}
				}
				if(x==8){
					z = i;
					break;
				}
			}
		}
		System.out.println(z);
	}
	public void problem52(){
		int z = 0;
		loop: for(int i = 10; true; i++){
			if(i>Math.pow(10, Math.log10(i)+1)/6){
				i = (int) Math.pow(10, Math.log10(i)+1);
			}
			for(int j = 2; j <= 6; j++){
				if(!Sub.isPermutation(""+i, ""+j*i)){
					continue loop;
				}
			}
			z = i;
			break;
		}
		System.out.println(z);
	}
	public void problem53(){
		int z = 0;
		int j;
		for(int i = 23; i <= 100; i++){
			j = 0;
			while(Sub.choose(i, j)<1000000 && j*2<=i){
				j++;
			}
			z += i+1 - 2*j;
		}
		System.out.println(z);
	}
	public void problem54(){
		int z = 0;
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		int x[] = new int[2];
		int y[] = new int[2];
		try {
		    BufferedReader in = new BufferedReader(new FileReader(getClass().getResource("poker.txt").getPath()));
		    String s;
		    int c[][][] = new int[2][2][5];
		    while ((s = in.readLine()) != null) {
		    	for(int i = 0; i < 10; i++){
		    		switch(s.charAt(i*3)){
		    		case '2': c[i/5][0][i%5] = 1;  break;
		    		case '3': c[i/5][0][i%5] = 2;  break;
		    		case '4': c[i/5][0][i%5] = 3;  break;
		    		case '5': c[i/5][0][i%5] = 4;  break;
		    		case '6': c[i/5][0][i%5] = 5;  break;
		    		case '7': c[i/5][0][i%5] = 6;  break;
		    		case '8': c[i/5][0][i%5] = 7;  break;
		    		case '9': c[i/5][0][i%5] = 8;  break;
		    		case 'T': c[i/5][0][i%5] = 9;  break;
		    		case 'J': c[i/5][0][i%5] = 10; break;
		    		case 'Q': c[i/5][0][i%5] = 11; break;
		    		case 'K': c[i/5][0][i%5] = 12; break;
		    		case 'A': c[i/5][0][i%5] = 13; break;
		    		}
		    		switch(s.charAt(i*3+1)){
		    		case 'D': c[i/5][1][i%5] = 1;  break;
		    		case 'H': c[i/5][1][i%5] = 2;  break;
		    		case 'C': c[i/5][1][i%5] = 3;  break;
		    		case 'S': c[i/5][1][i%5] = 4;  break;
		    		}
		    	}
		    	x[0] = 0;
		    	x[1] = 0;
		    	y[0] = 0;
		    	y[1] = 0;
		    	for(int i = 0; i < 2; i++){
		    		for(int j = 0; j < 5; j++){
			    		if(y[i]<c[i][0][j]){
			    			y[i] = c[i][0][j];
			    		}
			    	}
		    		if(c[i][1][0]==c[i][1][1]&&c[i][1][0]==c[i][1][2]&&c[i][1][0]==c[i][1][3]&&c[i][1][0]==c[i][1][4]){
		    			x[i] = 5;
		    			Arrays.sort(c[i][0]);
		    			if(c[i][0][0]+1==c[i][0][1]&&c[i][0][0]+2==c[i][0][2]&&c[i][0][0]+3==c[i][0][3]&&c[i][0][0]+4==c[i][0][4]){
		    				x[i] = 8;
		    				if(y[i]==13){
		    					x[i] = 9;
		    				}
			    		}
		    		}
		    		a.clear();
		    		a.add(1);
		    		b.clear();
		    		b.add(0);
		    		loop: for(int j = 1; j < 5; j++){
		    			for(int k = 0; k < b.size(); k++){
				    		if(c[i][0][b.get(k)]==c[i][0][j]){
				    			a.set(k, a.get(k)+1);
				    			continue loop;
				    		}
				    	}
		    			a.add(1);
		    			b.add(j);
			    	}
		    		if(a.contains(4)){
		    			y[i] = c[i][0][a.indexOf(4)];
    					x[i] = 7;
		    		}else if(a.contains(3)&&a.contains(2)){
		    			y[i] = c[i][0][b.get(a.indexOf(3))];
		    			x[i] = 6;
		    		}else if(a.contains(3)){
		    			y[i] = c[i][0][a.indexOf(3)];
		    			x[i] = 3;
		    		}else if(a.contains(2)&&a.indexOf(2)!=a.lastIndexOf(2)){
		    			y[i] = Math.max(c[i][0][b.get(a.indexOf(2))], c[i][0][b.get(a.lastIndexOf(2))]);
		    			x[i] = 2;
		    		}else if(a.contains(2)){
		    			y[i] = c[i][0][a.indexOf(2)];
		    			x[i] = 1;
		    		}else if(x[i] == 0){
		    			Arrays.sort(c[i][0]);
		    			if(c[i][0][0]+1==c[i][0][1]&&c[i][0][0]+2==c[i][0][2]&&c[i][0][0]+3==c[i][0][3]&&c[i][0][0]+4==c[i][0][4]){
		    				x[i] = 4;
			    		}
		    		}
		    	}
		    	if(x[0]*14+y[0] > x[1]*14+y[1]){
		    		z++;
		    	}
		    }
		    in.close();
		} catch (IOException e) {}
		System.out.println(z);
	}
	public void problem55(){
		int z = 0;
		int j;
		BigInteger x;
		for(int i = 1; i < 10000; i++){
			x = BigInteger.valueOf(i);
			for(j = 0; j < 50; j++){
				BigInteger y = new BigInteger(new StringBuilder(""+x).reverse().toString());
				x = x.add(y);
				if(Sub.isPalindrome(""+x)){
					break;
				}
			}
			if(j == 50){
				z++;
			}
		}
		System.out.println(z);
	}
	public void problem56(){
		int z = 0;
		int y = 0;
		String s;
		BigInteger x;
		for(int i = 91; i < 100; i++){
			for(int j = 91; j < 100; j++){
				x = BigInteger.valueOf(j).pow(i);
				s = x.toString();
				y = 0;
				for(int k = 0; k < s.length(); k++){
					y += Character.getNumericValue(s.charAt(k));
				}
				z = (int) Math.max(z, y);
			}
		}
		System.out.println(z);
	}
	public void problem57(){
		int z = 0;
		int a = 3;
		int b = 2;
		int c;
		for(int i = 1; i < 1000; i++){
			c = a + b;
			a = c + b;
			b = c;
			if(a>1000000){
				a/=10;
				b/=10;
			}
			if((int)Math.log10(a)!=(int)Math.log10(b)){
				z++;
			}
		}
		System.out.println(z);
	}
	public void problem58(){
		int z;
		int x = 0;
		for(z = 3; true; z+=2){
			for(int i = z-1; i < (z-1)*4; i+=z-1){
				if(Sub.isPrime(z*z-i)){
					x++;
				}
			}
			if((float)x/(2*(z-1)+1) < .1){
				break;
			}
		}
		System.out.println(z);
	}
	public void problem59(){
		int z = 0;
		ArrayList<Byte> n = new ArrayList<Byte>();
		try {
			FileInputStream is = new FileInputStream(getClass().getResource("cipher1.txt").getPath());
			char in = ' ';
			String number = "";
			while(Character.isDefined(in)){
				in = (char)is.read();
				if(in==','){
					n.add(Byte.parseByte(number));
					number = "";
				}else{
					number += in;
				}
			}
			n.add(Byte.parseByte(number.substring(0, 2)));
			is.close();
		} catch (IOException e) {e.printStackTrace();}
		int x;
		int i[] = new int[3];
		loop: for(i[0] = 97; i[0] < 123; i[0]++){
			for(i[1] = 97; i[1] < 123; i[1]++){
				for(i[2] = 97; i[2] < 123; i[2]++){
					x = 0;
					for(int j = 0; j < 100; j++){
						int k = i[j%3]^n.get(j);
						if(		Character.isLetterOrDigit(k)||
								Character.isWhitespace(k)||
								k==','||k=='.'||k=='!'||k=='?'||
								k==':'||k==';'||k=='('||k==')'){
							x++;
						}
					}
					if(x==100){
						String s = "";
						for(int j = 0; j < n.size(); j++){
							s += (char)(i[j%3]^n.get(j));
						}
						System.out.println(s);
						break loop;
					}
				}
			}
		}
		for(int j = 0; j < n.size(); j++){
			z += i[j%3]^n.get(j);
		}
		System.out.println(z);
	}
	public void problem60(){
		int z = 0;
		ArrayList<Integer> p = new ArrayList<Integer>();
		for(int i = 3; i < 10000; i+=2){
			if(Sub.isPrime(i)){
				p.add(i);
			}
		}
		int i[] = new int[5];
		loop: for(i[0] = 0; i[0] < p.size()-4; i[0]++){
			for(i[1] = i[0]+1; i[1] < p.size()-3; i[1]++){
				if(!Sub.isPrime(Integer.parseInt(""+p.get(i[0])+p.get(i[1])))){
					continue;
				}
				if(!Sub.isPrime(Integer.parseInt(""+p.get(i[1])+p.get(i[0])))){
					continue;
				}
				for(i[2] = i[1]+1; i[2] < p.size()-2; i[2]++){
					if(!Sub.isPrime(Integer.parseInt(""+p.get(i[0])+p.get(i[2])))){
						continue;
					}
					if(!Sub.isPrime(Integer.parseInt(""+p.get(i[1])+p.get(i[2])))){
						continue;
					}
					if(!Sub.isPrime(Integer.parseInt(""+p.get(i[2])+p.get(i[0])))){
						continue;
					}
					if(!Sub.isPrime(Integer.parseInt(""+p.get(i[2])+p.get(i[1])))){
						continue;
					}
					for(i[3] = i[2]+1; i[3] < p.size()-1; i[3]++){
						if(!Sub.isPrime(Integer.parseInt(""+p.get(i[0])+p.get(i[3])))){
							continue;
						}
						if(!Sub.isPrime(Integer.parseInt(""+p.get(i[1])+p.get(i[3])))){
							continue;
						}
						if(!Sub.isPrime(Integer.parseInt(""+p.get(i[2])+p.get(i[3])))){
							continue;
						}
						if(!Sub.isPrime(Integer.parseInt(""+p.get(i[3])+p.get(i[0])))){
							continue;
						}
						if(!Sub.isPrime(Integer.parseInt(""+p.get(i[3])+p.get(i[1])))){
							continue;
						}
						if(!Sub.isPrime(Integer.parseInt(""+p.get(i[3])+p.get(i[2])))){
							continue;
						}
						for(i[4] = i[3]+1; i[4] < p.size(); i[4]++){
							if(!Sub.isPrime(Integer.parseInt(""+p.get(i[0])+p.get(i[4])))){
								continue;
							}
							if(!Sub.isPrime(Integer.parseInt(""+p.get(i[1])+p.get(i[4])))){
								continue;
							}
							if(!Sub.isPrime(Integer.parseInt(""+p.get(i[2])+p.get(i[4])))){
								continue;
							}
							if(!Sub.isPrime(Integer.parseInt(""+p.get(i[3])+p.get(i[4])))){
								continue;
							}
							if(!Sub.isPrime(Integer.parseInt(""+p.get(i[4])+p.get(i[0])))){
								continue;
							}
							if(!Sub.isPrime(Integer.parseInt(""+p.get(i[4])+p.get(i[1])))){
								continue;
							}
							if(!Sub.isPrime(Integer.parseInt(""+p.get(i[4])+p.get(i[2])))){
								continue;
							}
							if(!Sub.isPrime(Integer.parseInt(""+p.get(i[4])+p.get(i[3])))){
								continue;
							}
							break loop;
						}
					}
				}
			}
		}
		z = p.get(i[0]) + p.get(i[1]) + p.get(i[2]) + p.get(i[3]) + p.get(i[4]);
		System.out.println(z);
	}
	public void problem61(){
		int z = 0;
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		ArrayList<Integer> c = new ArrayList<Integer>();
		ArrayList<Integer> d = new ArrayList<Integer>();
		ArrayList<Integer> e = new ArrayList<Integer>();
		ArrayList<Integer> f = new ArrayList<Integer>();
		for(int i = 1; Math.log10(i*(i+1)/2) + 1 < 5; i++){
			if((int)Math.log10(i*(i+1)/2) + 1 == 4){
				a.add(i*(i+1)/2);
			}
		}
		for(int i = 1; Math.log10(i*i) + 1 < 5; i++){
			if((int)Math.log10(i*i) + 1 == 4){
				b.add(i*i);
			}
		}
		for(int i = 1; Math.log10(i*(3*i-1)/2) + 1 < 5; i++){
			if((int)Math.log10(i*(3*i-1)/2) + 1 == 4){
				c.add(i*(3*i-1)/2);
			}
		}
		for(int i = 1; Math.log10(i*(2*i-1)) + 1 < 5; i++){
			if((int)Math.log10(i*(2*i-1)) + 1 == 4){
				d.add(i*(2*i-1));
			}
		}
		for(int i = 1; Math.log10(i*(5*i-3)/2) + 1 < 5; i++){
			if((int)Math.log10(i*(5*i-3)/2) + 1 == 4){
				e.add(i*(5*i-3)/2);
			}
		}
		for(int i = 1; Math.log10(i*(3*i-2)) + 1 < 5; i++){
			if((int)Math.log10(i*(3*i-2)) + 1 == 4){
				f.add(i*(3*i-2));
			}
		}
		ArrayList<Integer> n = new ArrayList<Integer>();
		for(int i: f){
			int j = problem61r(n, i, i, a, b, c, d, e);
			if(j != 0){
				z = i + j;
				break;
			}
		}
		System.out.println(z);
	}
	public int problem61r(ArrayList<Integer> n, int x, int y, ArrayList<Integer> a, ArrayList<Integer> b, ArrayList<Integer> c, ArrayList<Integer> d, ArrayList<Integer> e){
		if(!n.contains(1)){
			n.add(1);
			for(int i: a){
				if(x%100 == i/100){
					int j = problem61r(n, i, y, a, b, c, d, e);
					if(j != 0){
						return i + j;
					}else if(n.size() == 5 && i%100 == y/100){
						return i;
					}
				}
			}
			n.remove(Integer.valueOf(1));
		}
		if(!n.contains(2)){
			n.add(2);
			for(int i: b){
				if(x%100 == i/100){
					int j = problem61r(n, i, y, a, b, c, d, e);
					if(j != 0){
						return i + j;
					}else if(n.size() == 5 && i%100 == y/100){
						return i;
					}
				}
			}
			n.remove(Integer.valueOf(2));
		}
		if(!n.contains(3)){
			n.add(3);
			for(int i: c){
				if(x%100 == i/100){
					int j = problem61r(n, i, y, a, b, c, d, e);
					if(j != 0){
						return i + j;
					}else if(n.size() == 5 && i%100 == y/100){
						return i;
					}
				}
			}
			n.remove(Integer.valueOf(3));
		}
		if(!n.contains(4)){
			n.add(4);
			for(int i: d){
				if(x%100 == i/100){
					int j = problem61r(n, i, y, a, b, c, d, e);
					if(j != 0){
						return i + j;
					}else if(n.size() == 5 && i%100 == y/100){
						return i;
					}
				}
			}
			n.remove(Integer.valueOf(4));
		}
		if(!n.contains(5)){
			n.add(5);
			for(int i: e){
				if(x%100 == i/100){
					int j = problem61r(n, i, y, a, b, c, d, e);
					if(j != 0){
						return i + j;
					}else if(n.size() == 5 && i%100 == y/100){
						return i;
					}
				}
			}
			n.remove(Integer.valueOf(5));
		}
		return 0;
	}
	public void problem62(){
		BigInteger z = BigInteger.ZERO;
		int x, y;
		BigInteger w, u;
		String s, t = "";
		for(int i = 1; i < 20000; i++){
			w = BigInteger.valueOf(i).pow(3);
			s = w.toString();
			x = s.length();
			t = s;
			y = 1;
			for(int j = 1; x == t.length(); j++){
				u = BigInteger.valueOf(i+j).pow(3);
				t = u.toString();
				if(Sub.isPermutation(s, t)){
					y++;
				}
			}
			if(y == 5){
				z = w;
				break;
			}
		}
		System.out.println(z);
	}
	public void problem63(){
		int z = 21;
		for(int i = 1; i < 9; i++){
			for(int j = 1; j == (int) Math.log10(Math.pow(i,j)) + 1; j++){
				z++;
			}
		}
		System.out.println(z);
	}
	public void problem64(){
		int z = 0;
		int t, w, x, y;
		for(int i = 2; i <= 10000; i++){
			if((int) Math.sqrt(i) == Math.sqrt(i)){
				continue;
			}
			w = 1;
			x = (int) -Math.sqrt(i);
			t = x;
			y = i-x*x;
			x = -x - y*((int)((Math.sqrt(i)-x)/y));
			while(y!=1 || x!=t){
				y = (i-x*x) / y;
				x = -x - y*((int)((Math.sqrt(i)-x)/y));
				w++;
			}
			if(w%2==1){
				z++;
			}
		}
		System.out.println(z);
	}
	public void problem65(){
		int z = 0;
		BigInteger t = BigInteger.valueOf(2), h = BigInteger.valueOf(3);
		BigInteger w = BigInteger.ONE, x = BigInteger.valueOf(2), y = null;
		for(int i = 1; i < 100; i++){
			y = (BigInteger.valueOf(i).mod(h).compareTo(t)==0?BigInteger.valueOf(i).add(BigInteger.ONE).divide(h).multiply(t):BigInteger.ONE).multiply(x).add(w);
			w = x;
			x = y;
		}
		String s = y.toString();
		for(int i = 0; i < s.length(); i++){
			z += Character.getNumericValue(s.charAt(i));
		}
		System.out.println(z);
	}
	public void problem66(){
		long z = 0;
		BigInteger x;
		loop: for(long i = 2; i <= 1000; i++){
			if((int) Math.sqrt(i) == Math.sqrt(i)){
				continue;
			}
			for(long j = 2; true; j++){
				if(BigInteger.valueOf(j).pow(2).subtract(BigInteger.ONE).mod(BigInteger.valueOf(i)).compareTo(BigInteger.ZERO) != 0){
					continue;
				}
				x = BigInteger.valueOf(j).pow(2).subtract(BigInteger.ONE).divide(BigInteger.valueOf(i));
				if(Sub.sqrt(x).pow(2).equals(x)){
					if(z < j){
						z = j;
					}
					continue loop;
				}
			}
		}
		System.out.println(z);
	}
	/*
	public void problem(){
		int z = 0;
		
		System.out.println(z);
	}
	for(int i = 1; i < 10; i++){
		
	}
	ArrayList<Integer> n = new ArrayList<Integer>();
	x = (int) Math.log10(i) + 1;
	*/
}
