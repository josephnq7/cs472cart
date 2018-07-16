package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import domain.Product;


public class ProductDao {

	private Map<Integer, Product> productsDb = new HashMap<>();
	{
		//cat 1
		productsDb.put(1, new Product(1, "Introducing HTML5", "html5.jpg","New development in web and application design","HTML5 continues to evolve, browsers are implementating at break-neck speed and HTML5 web sites spring up like flowers after rain. More than ever, you need to get acquainted with the powerful new possibilities in web and application design. That’s why we’ve crafted a second edition of this book to help you stay on top of current developments. This book shows you how to start adapting the language now to realize its benefits on today’s browsers. It concentrates on the practical—the problems HTML5 can solve for you right away", 27.97, 1));
		productsDb.put(2, new Product(2, "Mastering CSS", "masteringcss.jpg","A guided journey through modern CSS","Rich Finelli trains you in CSS deep learning and shows you the techniques you need to work in the world of responsive, feature-rich web applications. Based on his bestselling Mastering CSS training video, you can now learn with Rich in this book! Rich shares with you his skills in creating advanced layouts, and the critical CSS insights you need for responsive web designs, fonts, transitions, animations, and using flexbox.", 39.99, 1));
		productsDb.put(3, new Product(3, "JavaScript & JQuery", "javascript.jpg","Interactive Front-End Web Development","Learn JavaScript and jQuery a nicer way This full-color book adopts a visual approach to teaching JavaScript & jQuery, showing you how to make web pages more interactive and interfaces more intuitive through the use of inspiring code examples, infographics, and photography. The content assumes no previous programming experience, other than knowing how to create a basic web page in HTML & CSS", 23.07, 1));
		productsDb.put(4, new Product(4, "Learning Web Design", "webdesign.jpg","A Beginner's Guide to HTML, CSS, JavaScript, and Web Graphics","Learn how to use the latest techniques, best practices, and current web standards—including HTML5 and CSS3. Each chapter provides exercises to help you to learn various techniques, and short quizzes to make sure you understand key concepts.", 28.82, 1));
		productsDb.put(5, new Product(5, "Communicating design", "communicatingdesign.jpg","Developing web site documentation for design and planning, by Dan M. Brown","Successful web design teams depend on clear communication between developers and their clients—and among members of the development team. Wireframes, site maps, flow charts, and other design diagrams establish a common language so designers and project teams can capture ideas, track progress, and keep their stakeholders informed.", 40.14, 1));
		productsDb.put(6, new Product(6, "Head First Ajax", "ajax.jpg","Head First Ajax is the ideal guide for experienced web developers comfortable with scripting","Ajax is no longer an experimental approach to website development, but the key to building browser-based applications that form the cornerstone of Web 2.0. Head First Ajax gives you an up-to-date perspective that lets you see exactly what you can do—and has been done—with Ajax.", 9.7, 1));

		//cat 2
		productsDb.put(7, new Product(7, "Core Java Volume I", "java.jpg","Fundamentals, Eleventh Edition","Whether you’re using Java SE 9, 10, or 11, it will help you achieve a deep and practical understanding of the language and API, and its hundreds of realistic examples reveal the most powerful and effective ways to get the job done", 51.43, 2));
		productsDb.put(8, new Product(8, "iOS Programming", "ios.jpg","The Big Nerd Ranch Guide (6th Edition) (Big Nerd Ranch Guides)","After completing this book, you will have the know-how and the confidence you need to tackle iOS projects of your own. Based on Big Nerd Ranch's popular iOS training and its well-tested materials and methodology, this bestselling guide teaches iOS concepts and coding in tandem", 30.39, 2));
		productsDb.put(9, new Product(9, "Android Studio Cookbook", "anndroid.jpg","Design, test, and debug your apps ","This book is for developers that are already familiar with programming concepts and have already started creating apps for the Android platform, for example, by using the Eclipse IDE", 35.99, 2));
		productsDb.put(10, new Product(10, "Python Programming", "python.jpg","A Step By Step Guide For Beginners (2nd Edition)","Python is a very beginners friendly Programming Language perfect for people who are new to the Programming world due to its straightforward approach and syntax.", 16.30, 2));
		productsDb.put(11, new Product(11, "Programming .NET Components", "net.jpg","Introduction to the Microsoft .NET Framework"," From its many lessons, tips, and guidelines, readers will learn how to use the .NET Framework to program reusable, maintainable, and robust components", 16.88, 2));
		productsDb.put(12, new Product(12, "PHP for the Web", "php.jpg","Visual QuickStart Guide","This task-based visual reference guide uses step-by-step instructions and plenty of screenshots to teach beginning and intermediate users this popular open-source scripting language", 15.65, 2));

	}
	
	public List<Product> getProductByCategoryId(int categoryId) {
		return productsDb.entrySet().stream()
				.filter(p -> p.getValue().getCategoryId() == categoryId)
				.map(p -> p.getValue()).collect(Collectors.toList());
	}

	public Product getProductById(int id) {
		return productsDb.get(id);
	}
}
