package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: f90, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5153f90 extends ViewGroup.MarginLayoutParams {
    public AbstractC3779b90 a;
    public boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public View k;
    public View l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public final Rect q;

    public C5153f90() {
        super(-2, -2);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.q = new Rect();
    }

    public C5153f90(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC3779b90 abstractC3779b90;
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.q = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, JG2.f11448J);
        this.c = obtainStyledAttributes.getInteger(0, 0);
        this.f = obtainStyledAttributes.getResourceId(1, -1);
        this.d = obtainStyledAttributes.getInteger(2, 0);
        this.e = obtainStyledAttributes.getInteger(6, -1);
        this.g = obtainStyledAttributes.getInt(5, 0);
        this.h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.x;
            if (TextUtils.isEmpty(string)) {
                abstractC3779b90 = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.x;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.z;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.y);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC3779b90 = (AbstractC3779b90) constructor.newInstance(context, attributeSet);
                } catch (Exception e) {
                    throw new RuntimeException(AbstractC4809e90.a("Could not inflate Behavior subclass ", string), e);
                }
            }
            this.a = abstractC3779b90;
        }
        obtainStyledAttributes.recycle();
        AbstractC3779b90 abstractC3779b902 = this.a;
        if (abstractC3779b902 != null) {
            abstractC3779b902.c(this);
        }
    }

    public C5153f90(C5153f90 c5153f90) {
        super((ViewGroup.MarginLayoutParams) c5153f90);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.q = new Rect();
    }

    public C5153f90(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.q = new Rect();
    }

    public C5153f90(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.q = new Rect();
    }

    public final void b(AbstractC3779b90 abstractC3779b90) {
        AbstractC3779b90 abstractC3779b902 = this.a;
        if (abstractC3779b902 != abstractC3779b90) {
            if (abstractC3779b902 != null) {
                abstractC3779b902.getClass();
            }
            this.a = abstractC3779b90;
            this.b = true;
            if (abstractC3779b90 != null) {
                abstractC3779b90.c(this);
            }
        }
    }

    public final boolean a(int i) {
        if (i == 0) {
            return this.n;
        }
        if (i != 1) {
            return false;
        }
        return this.o;
    }
}
