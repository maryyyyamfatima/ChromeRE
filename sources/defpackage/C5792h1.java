package defpackage;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: h1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5792h1 {
    public static final C5792h1 A;
    public static final C5792h1 B;
    public static final C5792h1 C;
    public static final C5792h1 D;
    public static final C5792h1 E;
    public static final C5792h1 F;
    public static final C5792h1 G;
    public static final C5792h1 H;
    public static final C5792h1 I;

    /* renamed from: J, reason: collision with root package name */
    public static final C5792h1 f11510J;
    public static final C5792h1 e = new C5792h1(1, (CharSequence) null);
    public static final C5792h1 f = new C5792h1(2, (CharSequence) null);
    public static final C5792h1 g;
    public static final C5792h1 h;
    public static final C5792h1 i;
    public static final C5792h1 j;
    public static final C5792h1 k;
    public static final C5792h1 l;
    public static final C5792h1 m;
    public static final C5792h1 n;
    public static final C5792h1 o;
    public static final C5792h1 p;
    public static final C5792h1 q;
    public static final C5792h1 r;
    public static final C5792h1 s;
    public static final C5792h1 t;
    public static final C5792h1 u;
    public static final C5792h1 v;
    public static final C5792h1 w;
    public static final C5792h1 x;
    public static final C5792h1 y;
    public static final C5792h1 z;
    public final Object a;
    public final int b;
    public final Class c;
    public final S1 d;

    static {
        new C5792h1(4, (CharSequence) null);
        new C5792h1(8, (CharSequence) null);
        g = new C5792h1(16, (CharSequence) null);
        h = new C5792h1(32, (CharSequence) null);
        i = new C5792h1(64, (CharSequence) null);
        j = new C5792h1(128, (CharSequence) null);
        k = new C5792h1(256, L1.class);
        l = new C5792h1(512, L1.class);
        m = new C5792h1(1024, M1.class);
        n = new C5792h1(2048, M1.class);
        o = new C5792h1(4096, (CharSequence) null);
        p = new C5792h1(8192, (CharSequence) null);
        q = new C5792h1(16384, (CharSequence) null);
        r = new C5792h1(32768, (CharSequence) null);
        s = new C5792h1(65536, (CharSequence) null);
        t = new C5792h1(131072, Q1.class);
        u = new C5792h1(262144, (CharSequence) null);
        v = new C5792h1(524288, (CharSequence) null);
        w = new C5792h1(1048576, (CharSequence) null);
        x = new C5792h1(2097152, R1.class);
        int i2 = Build.VERSION.SDK_INT;
        y = new C5792h1(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new C5792h1(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, O1.class);
        z = new C5792h1(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        A = new C5792h1(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        B = new C5792h1(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        C = new C5792h1(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        D = new C5792h1(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        E = new C5792h1(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
        F = new C5792h1(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        G = new C5792h1(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
        H = new C5792h1(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        I = new C5792h1(i2 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, null, P1.class);
        new C5792h1(i2 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, N1.class);
        new C5792h1(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
        new C5792h1(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
        new C5792h1(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        f11510J = new C5792h1(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
    }

    public C5792h1(int i2, CharSequence charSequence) {
        this(null, i2, charSequence, null, null);
    }

    public C5792h1(int i2, Class cls) {
        this(null, i2, null, null, cls);
    }

    public C5792h1(Object obj, int i2, CharSequence charSequence, S1 s1, Class cls) {
        this.b = i2;
        this.d = s1;
        if (obj == null) {
            this.a = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
        } else {
            this.a = obj;
        }
        this.c = cls;
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.a).getId();
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C5792h1)) {
            return false;
        }
        Object obj2 = ((C5792h1) obj).a;
        Object obj3 = this.a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }
}
