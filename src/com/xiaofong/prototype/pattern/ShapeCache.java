package com.xiaofong.prototype.pattern;

import java.util.Hashtable;

import com.xiaofong.prototype.pattern.abst.Shape;
import com.xiaofong.prototype.pattern.abst.impl.Circle;
import com.xiaofong.prototype.pattern.abst.impl.Rectangle;
import com.xiaofong.prototype.pattern.abst.impl.Square;

public class ShapeCache {

	private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

	public static Shape getShape(String shapeId) {
		Shape cacheShape = shapeMap.get(shapeId);
		return (Shape) cacheShape.clone();
	}

	// 对每种形状都运行数据库查询, 并创建该形状
	public static void loadCache() {

		Circle circle = new Circle();
		circle.setId("1");
		shapeMap.put(circle.getId(), circle);

		Rectangle rectangle = new Rectangle();
		rectangle.setId("2");
		shapeMap.put(rectangle.getId(), rectangle);

		Square square = new Square();
		square.setId("3");
		shapeMap.put(square.getId(), square);

	}

}
