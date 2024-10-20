package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.android.chrome.R;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bH3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3823bH3 implements R8 {
    public static final HashSet q = new HashSet();
    public static final C8385oa2 r = new C8385oa2();
    public final Context a;
    public final Handler g;
    public final boolean h;
    public final T8 i;
    public C6379ik j;
    public final Runnable k;
    public long l;
    public final ZG3 m;
    public long n;
    public final boolean o;
    public final View p;

    public C3823bH3(Context context, View view, int i, int i2, ViewTreeObserverOnGlobalLayoutListenerC8754pe4 viewTreeObserverOnGlobalLayoutListenerC8754pe4, boolean z) {
        this(context, view, i, i2, viewTreeObserverOnGlobalLayoutListenerC8754pe4, z, 0);
    }

    public C3823bH3(Context context, View view, int i, int i2, ViewTreeObserverOnGlobalLayoutListenerC8754pe4 viewTreeObserverOnGlobalLayoutListenerC8754pe4, boolean z, int i3) {
        this(context, view, context.getString(i), context.getString(i2), true, viewTreeObserverOnGlobalLayoutListenerC8754pe4, null, false, z);
    }

    public C3823bH3(Context context, View view, String str, String str2, boolean z, LI2 li2, boolean z2) {
        this(context, view, str, str2, z, li2, null, false, z2);
    }

    public C3823bH3(Context context, View view, String str, String str2, boolean z, LI2 li2, Drawable drawable, boolean z2, boolean z3) {
        this(context, view, str, str2, z, li2, drawable, z2, z3, null);
    }

    public C3823bH3(Context context, View view, String str, String str2, boolean z, LI2 li2, Drawable drawable, boolean z2, boolean z3, N44 n44) {
        View view2;
        this.m = new ZG3(this);
        C3479aH3 c3479aH3 = new C3479aH3(this);
        this.n = 0L;
        this.a = context;
        this.h = false;
        this.o = z3;
        this.k = n44;
        Drawable e = e(context, z, z2);
        if (drawable == null) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.f61520_resource_name_obfuscated_res_0x7f0e02bc, (ViewGroup) null);
            ((TextView) inflate.findViewById(R.id.message)).setText(z3 ? str2 : str);
            if (n44 != null) {
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f41680_resource_name_obfuscated_res_0x7f0807c5);
                int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.f41670_resource_name_obfuscated_res_0x7f0807c4);
                TextView textView = (TextView) inflate.findViewById(R.id.message);
                textView.setPadding(dimensionPixelSize, textView.getPaddingTop(), dimensionPixelSize2, textView.getPaddingBottom());
            }
            if (n44 != null) {
                Button button = (Button) inflate.findViewById(R.id.button_snooze);
                button.setVisibility(0);
                button.setOnClickListener(new View.OnClickListener() { // from class: YG3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        C3823bH3 c3823bH3 = C3823bH3.this;
                        c3823bH3.k.run();
                        c3823bH3.m.run();
                    }
                });
            }
            view2 = inflate;
        } else {
            View inflate2 = LayoutInflater.from(context).inflate(R.layout.f61530_resource_name_obfuscated_res_0x7f0e02bd, (ViewGroup) null);
            ((ImageView) inflate2.findViewById(R.id.image)).setImageDrawable(drawable);
            ((TextView) inflate2.findViewById(R.id.message)).setText(z3 ? str2 : str);
            view2 = inflate2;
        }
        this.p = view2;
        view2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        T8 t8 = new T8(context, view, e, view2, li2);
        this.i = t8;
        t8.r = context.getResources().getDimensionPixelSize(R.dimen.f41660_resource_name_obfuscated_res_0x7f0807c3);
        t8.v = 1;
        t8.q = this;
        this.g = new Handler();
        t8.d(R.style.f103200_resource_name_obfuscated_res_0x7f15047d);
        a(c3479aH3);
        if (z3) {
            g(true);
        }
    }

    public Drawable e(Context context, boolean z, boolean z2) {
        Context context2 = this.a;
        C6379ik c6379ik = new C6379ik(context2, z2);
        this.j = c6379ik;
        c6379ik.q = z;
        c6379ik.invalidateSelf();
        if (this.h) {
            C6379ik c6379ik2 = this.j;
            int a = AbstractC10957w33.a(context2);
            c6379ik2.k.setTint(a);
            c6379ik2.j.setColor(a);
            c6379ik2.invalidateSelf();
        } else {
            C6379ik c6379ik3 = this.j;
            int b = AbstractC10957w33.b(context2);
            c6379ik3.k.setTint(b);
            c6379ik3.j.setColor(b);
            c6379ik3.invalidateSelf();
        }
        return this.j;
    }

    public final void h() {
        T8 t8 = this.i;
        if (t8.c()) {
            return;
        }
        if (!t8.c()) {
            long j = this.n;
            if (j != 0) {
                this.g.postDelayed(this.m, j);
            }
        }
        t8.e();
        HashSet hashSet = q;
        hashSet.add(this);
        r.p(Integer.valueOf(hashSet.size()));
        this.l = System.currentTimeMillis();
    }

    public final void b() {
        this.i.b();
        if (this.l != 0) {
            EI2.n(System.currentTimeMillis() - this.l, "InProductHelp.TextBubble.ShownTime");
            this.l = 0L;
        }
    }

    public static void d() {
        Iterator it = new HashSet(q).iterator();
        while (it.hasNext()) {
            ((C3823bH3) it.next()).b();
        }
    }

    public final void a(PopupWindow.OnDismissListener onDismissListener) {
        this.i.a(onDismissListener);
    }

    public final void f(long j) {
        if (this.o) {
            return;
        }
        this.n = j;
        Handler handler = this.g;
        ZG3 zg3 = this.m;
        handler.removeCallbacks(zg3);
        if (this.i.c()) {
            long j2 = this.n;
            if (j2 != 0) {
                handler.postDelayed(zg3, j2);
            }
        }
    }

    public final void g(boolean z) {
        boolean z2 = this.o || z;
        T8 t8 = this.i;
        t8.n = z2;
        t8.k.setOutsideTouchable(z2);
    }

    @Override // defpackage.R8
    public final void c(boolean z, int i, int i2, Rect rect) {
        int i3;
        C6379ik c6379ik = this.j;
        if (c6379ik == null) {
            return;
        }
        if (c6379ik.q) {
            int centerX = rect.centerX() - i;
            C6379ik c6379ik2 = this.j;
            ShapeDrawable shapeDrawable = c6379ik2.k;
            Rect rect2 = c6379ik2.a;
            shapeDrawable.getPadding(rect2);
            int i4 = (c6379ik2.g / 2) + c6379ik2.n + rect2.left;
            C6379ik c6379ik3 = this.j;
            ShapeDrawable shapeDrawable2 = c6379ik3.k;
            Rect rect3 = c6379ik3.a;
            shapeDrawable2.getPadding(rect3);
            i3 = JM1.c(centerX, i4, i2 - ((c6379ik3.g / 2) + (c6379ik3.n + rect3.right)));
        } else {
            i3 = 0;
        }
        C6379ik c6379ik4 = this.j;
        if (i3 == c6379ik4.o && z == c6379ik4.p) {
            return;
        }
        c6379ik4.o = i3;
        c6379ik4.p = z;
        c6379ik4.onBoundsChange(c6379ik4.getBounds());
        c6379ik4.invalidateSelf();
    }
}
