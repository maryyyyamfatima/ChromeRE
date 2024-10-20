package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class T8 implements View.OnTouchListener {
    public boolean A;
    public S8 h;
    public final Handler i;
    public final View j;
    public final PopupWindow k;
    public final LI2 l;
    public boolean n;
    public final C12157za2 o;
    public View.OnTouchListener p;
    public R8 q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public final Rect a = new Rect();
    public final Rect g = new Rect();
    public final P8 m = new P8(this);

    public T8(Context context, View view, Drawable drawable, View view2, LI2 li2) {
        Q8 q8 = new Q8(this);
        this.o = new C12157za2();
        this.u = 0;
        this.v = 0;
        this.j = view.getRootView();
        PopupWindow b = C9225r04.d().b(context);
        this.k = b;
        this.i = new Handler();
        this.l = li2;
        this.h = new S8(new Rect(), false, false);
        b.setWidth(-2);
        b.setHeight(-2);
        b.setBackgroundDrawable(drawable);
        b.setContentView(view2);
        b.setTouchInterceptor(this);
        b.setOnDismissListener(q8);
    }

    public final void e() {
        PopupWindow popupWindow = this.k;
        if (popupWindow.isShowing()) {
            return;
        }
        this.l.a(this);
        f();
        try {
            View view = this.j;
            Rect rect = this.h.c;
            popupWindow.showAtLocation(view, 8388659, rect.left, rect.top);
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    public final void b() {
        this.k.dismiss();
    }

    public final boolean c() {
        return this.k.isShowing();
    }

    public final void a(PopupWindow.OnDismissListener onDismissListener) {
        this.o.a(onDismissListener);
    }

    public final void d(int i) {
        this.k.setAnimationStyle(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x020e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0130 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0138 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.T8.f():void");
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.p;
        boolean z = onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
        FI2.a(motionEvent.getAction() == 4 ? "InProductHelp.OutsideTouch" : "InProductHelp.InsideTouch");
        if (this.n) {
            if (!(!z && this.k.getContentView().dispatchTouchEvent(motionEvent))) {
                b();
            }
        }
        return z;
    }
}
