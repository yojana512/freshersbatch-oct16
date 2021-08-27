import java.util.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;

class CustomP {
     public static <T> Predicate<T> distinctByKey(Function<? super T,Object> keyExtractor){
    	 Map<Object, Boolean> uniqueMap = new ConcurrentHashMap<>();
    	 return t -> uniqueMap.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
     }
}

class Fruit{
	String name;
	int calaries;
	int price;
	String color;
	public Fruit(String name, int calaries, int price, String color) {
		super();
		this.name = name;
		this.calaries = calaries;
		this.price = price;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCalaries() {
		return calaries;
	}
	public void setCalaries(int calaries) {
		this.calaries = calaries;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fruit [");
		if (name != null)
			builder.append("name=").append(name).append(", ");
		builder.append("calaries=").append(calaries).append(", price=").append(price).append(", ");
		if (color != null)
			builder.append("color=").append(color);
		builder.append("]");
		return builder.toString();
	}
	
}
class News{
	int newsId;
	String postedByUser;
	String commentedByUser;
	String comment;
	public News(int newsId, String postedByUser, String commentedByUser, String comment) {
		super();
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentedByUser = commentedByUser;
		this.comment = comment;
	}
	public int getNewsId() {
		return newsId;
	}
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}
	public String getPostedByUser() {
		return postedByUser;
	}
	public void setPostedByUser(String postedByUser) {
		this.postedByUser = postedByUser;
	}
	public String getCommentedByUser() {
		return commentedByUser;
	}
	public void setCommentedByUser(String commentedByUser) {
		this.commentedByUser = commentedByUser;
	}
	public  String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("News [newsId=").append(newsId).append(", ");
		if (postedByUser != null)
			builder.append("postedByUser=").append(postedByUser).append(", ");
		if (commentedByUser != null)
			builder.append("commentedByUser=").append(commentedByUser).append(", ");
		if (comment != null)
			builder.append("comment=").append(comment);
		builder.append("]");
		return builder.toString();
	}
	
}
class Trader{
	String name;
	String city;
	public Trader(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Trade [");
		if (name != null)
			builder.append("name=").append(name).append(", ");
		if (city != null)
			builder.append("city=").append(city);
		builder.append("]");
		return builder.toString();
	}
	
}
class Transaction{
	Trader trader;
	int year;
	int value;
	public Transaction(Trader t1, int year, int value) {
		super();
		this.trader = t1;
		this.year = year;
		this.value = value;
		
	}
	public Trader getTrader() {
		return trader;
	}
	public void setTrader(Trader trader) {
		this.trader = trader;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Transaction [");
		if (trader != null)
			builder.append("trader=").append(trader).append(", ");
		builder.append("year=").append(year).append(", value=").append(value).append("]");
		return builder.toString();
	}
	
}
public class Streams {
	@SuppressWarnings({ "unused", "unchecked" })
	public static void main(String args[]) {
		List<Fruit> fruit=Arrays.asList(
				new Fruit("Apple",100,80,"Red"),
				new Fruit("Orange",80,50,"Orange"),
				new Fruit("Grape",75,120,"Green"),
				new Fruit("Banana",180,30,"Yellow"),
				new Fruit("Straberries",90,60,"Red"),
				new Fruit("Guava",120,130,"Green")
				);
	List<News> news=Arrays.asList(
			new News(101,"Posted_A","Commented_A","Good,Good,Awsome,Great,Good"),
			new News(102,"Posted_B","Commented_B","Average,noce,better"),
			new News(103,"Posted_C","Commented_A","Good,avegare"),
			new News(104,"Posted_D","Commented_D","Bad")
			);
		Trader t1=new Trader("Trader_A","Indore");
		Trader t2=new Trader("Trader_B","Pune");
		Trader t3=new Trader("trader_C","Pune");
		Trader t4=new Trader("trader_D","Delhi");
		List<Trader> trader= new ArrayList<Trader>();
		trader.add(t1);
		trader.add(t2);
		trader.add(t3);
	List<Transaction> trans=Arrays.asList(
			new Transaction(t1,2000,10000),
			new Transaction(t2,2020,11000),
			new Transaction(t3,2011,9000),
			new Transaction(t4,2012,41000));
	System.out.println("\tQ1.Disaply fruit Names of Low calories<100");
	fruit.stream()
		    .filter(i -> i.getCalaries() <100)
		    .forEach(f->System.out.println(f.getName()));
	System.out.println("\n\tQ2.colorWise list of names ");
	fruit.stream()
		.collect(Collectors.toList())
	    .forEach(i->System.out.println(i.getName()+"\t"+i.getColor()));
	System.out.println("\n\tQ3.Red colorlist of names ");
	fruit.stream()
			.filter(i->i.getColor()=="Red")
			.sorted(Comparator.comparing(Fruit::getPrice)).collect(Collectors.toList())
			.forEach(System.out::println);
	int l=news.get(1).getComment().length();
	System.out.println("\n\tQ4.news ID Which received most comments");
	for(News i:news) {
		if(i.getComment().length()>l) {
			l=i.getComment().length();
		}
	}
	for(News i:news) {
		if(i.getComment().length()==l) {
			System.out.println(i.getNewsId());
		}
	}
	/*int s=l;
	Stream<News> ews =news.stream()
		.filter(i->i.getComment().length()>s);
	ews.forEach(i->System.out.println(i.getNewsId()));*/
	System.out.println("\n\tQ6.Most commented by the user");
	List<String> com=new ArrayList<String>();
	for(News i:news) {
		com.add(i.getCommentedByUser());
	}
	String maxVal = com.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .entrySet().stream().max((o1, o2) -> o1.getValue().compareTo(o2.getValue()))
            .map(Map.Entry::getKey).orElse(null);
	System.out.println(maxVal);
	//Que 9
			System.out.println("\n\tQ9.Unique City Where customers work");
			List<Trader> UniqueCity=trader.stream().filter(CustomP.distinctByKey(P -> P.getCity())).collect(Collectors.toList());
			UniqueCity.forEach(System.out::println);
			
			//Que10
			System.out.println("\n\tQ10.Traders from pune in sorting order");
			List<Trader> FromPune=trader.stream().filter(P -> P.city=="Pune").sorted(Comparator.comparing(Trader::getName)).collect(Collectors.toList());	
			FromPune.forEach(System.out::println);
			
			//Que11
			System.out.println("\n\t11.Sorted traders name");
			trader.stream().sorted(Comparator.comparing(Trader::getName)).forEach(P ->System.out.println(P.name));
			
			//Que12
			System.out.println("\n\tQ12 Traders from Indore");
			List<Trader> FromIndore=trader.stream().filter(P -> P.city=="Indore").collect(Collectors.toList());	
			FromIndore.forEach(System.out::println);
			//Que8
			System.out.println("\n\tQ8.2011 transactions And sorting them in order");
			List<Transaction> Year2011=trans.stream().filter(P -> P.year==2011).sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());
			Year2011.forEach(System.out::println);
			
			//Que14
			System.out.println("\n\tQ14.Highest value of Transaction");
			Transaction Max=trans.stream().max(Comparator.comparing(Transaction::getValue)).get();
			System.out.println(Max);
			
			//Que15
			System.out.println("\n\tQ15.Lowest value of Transaction");
			Transaction Min=trans.stream().min(Comparator.comparing(Transaction::getValue)).get();
			System.out.println(Min);
			
			//Que13
			System.out.println("\n\tQ13.Transaction from trader in Delhi");
			List<Transaction> FromDelhi=trans.stream().filter(P -> P.trader.equals("Delhi")).collect(Collectors.toList());	
			FromDelhi.forEach(System.out::println);
	}
	
}

