package com.example.admin.myapplication.main;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.admin.myapplication.R;
import com.example.admin.myapplication.decorate.Beverage;
import com.example.admin.myapplication.decorate.coffee.Espresso;
import com.example.admin.myapplication.decorate.coffee.HouseBlend;
import com.example.admin.myapplication.decorate.ingredient.Mocha;
import com.example.admin.myapplication.decorate.ingredient.Soy;
import com.example.admin.myapplication.decorate.ingredient.Whip;
import com.example.admin.myapplication.duck.Duck;
import com.example.admin.myapplication.duck.FlyRocketBehavior;
import com.example.admin.myapplication.duck.MallardDuck;
import com.example.admin.myapplication.factory.NYPizzaStoreNew;
import com.example.admin.myapplication.factory.Pizza;
import com.example.admin.myapplication.factory.PizzaStore;
import com.example.admin.myapplication.observer.CurrentConditionsDisplays;
import com.example.admin.myapplication.observer.ForecastDisplays;
import com.example.admin.myapplication.observer.StatisticsDisplays;
import com.example.admin.myapplication.observer.WeatherObservabler;
import com.example.admin.myapplication.weather.CurrentConditionsDisplay;
import com.example.admin.myapplication.weather.ForecastDisplay;
import com.example.admin.myapplication.weather.StatisticsDisplay;
import com.example.admin.myapplication.weather.WeatherData;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView mTitle;
    private ImageView mAnimationIV;
    private AnimationDrawable animationDrawable;
    private ComponentName mDouble12;
    private PackageManager mPm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPm = getApplicationContext().getPackageManager();
        mDouble12 = new ComponentName(
                getBaseContext(),
                "com.example.admin.myapplication.main.MainAliasActivity");
        initView();
//        initDuck();
        initWeather();
        initCofe();
        initPizza();


    }

    private void initPizza() {
//        PizzaStore pizzaStore = new NyPizzaStore();
//        Pizza pizza = pizzaStore.orderPizza("cheese");
//        System.out.println("Ethan ordered a"+pizza.getName()+"\n");

        PizzaStore pizzaStore = new NYPizzaStoreNew();
        Pizza cheese = pizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a "+cheese.getName()+"\n");
    }

    private void initCofe() {
        Beverage darkroats = new Espresso();
        darkroats = new Mocha(darkroats);
        darkroats = new Whip(darkroats);
        Log.e("initCofe", "darkroats: " + darkroats.getDescription() + "$" + darkroats.cost());
        Beverage houseBlend = new HouseBlend();
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        Log.e("initCofe", "houseBlend: " + houseBlend.getDescription() + "$" + houseBlend.cost());
    }

    private void initWeather() {
        WeatherData weatherData = new WeatherData();
        new CurrentConditionsDisplay(weatherData);
        new StatisticsDisplay(weatherData);
        new ForecastDisplay(weatherData);
        weatherData.setMeasurements(12f, 15f, 24f);
        weatherData.setMeasurements(22f, 25f, 34f);
        weatherData.setMeasurements(32f, 35f, 44f);

        WeatherObservabler observabler = new WeatherObservabler();
        new CurrentConditionsDisplays(observabler);
        new ForecastDisplays(observabler);
        new StatisticsDisplays(observabler);
        observabler.setMeasurements(12f, 15f, 24f);


    }

    private void initDuck() {
        Duck duck = new MallardDuck();
        duck.performDuack();
        duck.performFly();
        duck.setFlyBehavior(new FlyRocketBehavior());
        duck.performFly();
    }

    private void enableComponent(ComponentName componentName) {
        mPm.setComponentEnabledSetting(getComponentName(),
                PackageManager.COMPONENT_ENABLED_STATE_DISABLED,
                PackageManager.DONT_KILL_APP);
        mPm.setComponentEnabledSetting(componentName,
                PackageManager.COMPONENT_ENABLED_STATE_ENABLED,
                PackageManager.DONT_KILL_APP);
    }

    private void initView() {
        mTitle = (TextView) findViewById(R.id.title);
//        mTitle.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                animationDrawable.start();
//            }
//        });
        mAnimationIV = (ImageView) findViewById(R.id.animationIV);
//        mAnimationIV.setImageResource(R.drawable.load_animation);
//        animationDrawable = (AnimationDrawable) mAnimationIV.getDrawable();
        mAnimationIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enableComponent(mDouble12);

            }
        });

        Point<? extends Number> mPont;
        mPont = new Point<Integer>(123, 12);
        Number x = mPont.getX();

//        mPont.setX(new Integer(1));

        new InfoImpl();

        StaticFans.StaticMethod("123");
        StaticFans.<String>StaticMethod("123");


        List<? super Manager> list;
        list = new ArrayList<Employee>();
        list = new ArrayList<Manager>();
//        list = new ArrayList<CEO>();

//        list.add(new Employee());
        list.add(new Manager());
        list.add(new CEO());
        Object object = list.get(0);
//        Manager employee = list.get(0);

        Class<InfoImpl> infoClass = InfoImpl.class;

        Type type = infoClass.getGenericSuperclass();
        infoClass.getGenericInterfaces();

        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            //类型对象的数组表示的实际类型参数的类型
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            for (Type actualTypeArgument : actualTypeArguments) {
                Class typeArgumentClass = (Class) actualTypeArgument;
                /*泛型填充类型*/
                String name = typeArgumentClass.getName();//java.lang.String
            }
            Type rawType = parameterizedType.getRawType();
            Class rawTypeClass = (Class) rawType;
            /*父类类型为*/
            String name = rawTypeClass.getName();//com.example.admin.myapplication.main.Point
        }

        Class<Person> personClass = Person.class;
        Constructor<?>[] constructors = personClass.getConstructors();
        personClass.getDeclaredConstructors();
        try {
            personClass.getConstructor(int.class, String.class);
            Constructor<Person> constructor = personClass.getDeclaredConstructor(Integer.class, String.class);


            constructor.setAccessible(true);
            Person pilipala = constructor.newInstance(50, "pilipala");


        } catch (Exception e) {
            e.printStackTrace();
        }


        Class<Point> pointClass = Point.class;
        Constructor<?>[] declaredConstructors = pointClass.getDeclaredConstructors();
        for (Constructor<?> c : declaredConstructors) {
            c.setAccessible(true);
            Type[] types = c.getGenericParameterTypes();
            for (Type t : types) {
                if (t instanceof TypeVariable) {
                    TypeVariable t1 = (TypeVariable) t;
                    String name = t1.getName();
                    Type[] bounds = t1.getBounds();
                    Log.e("TypeVariable", "initView: " + name);
                }

            }
        }

        Class<InfoImpl> aClass = InfoImpl.class;
        InfoImpl info = null;
        try {
            info = aClass.newInstance();
            Field var = aClass.getField("var");
            var.set(info, "ppp");
        } catch (Exception e) {
        }

    }

    class CEO extends Manager {
    }

    class Manager extends Employee {
    }

    class Employee {


    }
}
