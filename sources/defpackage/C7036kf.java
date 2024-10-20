package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import com.android.chrome.R;
import java.lang.reflect.Method;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kf */
/* loaded from: classes.dex */
public final class C7036kf implements InterfaceC11483xc2 {
    public final /* synthetic */ LayoutInflaterFactory2C0545Ef a;

    public C7036kf(LayoutInflaterFactory2C0545Ef layoutInflaterFactory2C0545Ef) {
        this.a = layoutInflaterFactory2C0545Ef;
    }

    @Override // defpackage.InterfaceC11483xc2
    public final C5389fq4 a(View view, C5389fq4 c5389fq4) {
        boolean z;
        Hp4 c11563xp4;
        boolean z2;
        int color;
        C5389fq4 c5389fq42 = c5389fq4;
        int d = c5389fq4.d();
        LayoutInflaterFactory2C0545Ef layoutInflaterFactory2C0545Ef = this.a;
        layoutInflaterFactory2C0545Ef.getClass();
        int d2 = c5389fq4.d();
        ActionBarContextView actionBarContextView = layoutInflaterFactory2C0545Ef.u;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C0545Ef.u.getLayoutParams();
            if (layoutInflaterFactory2C0545Ef.u.isShown()) {
                if (layoutInflaterFactory2C0545Ef.c0 == null) {
                    layoutInflaterFactory2C0545Ef.c0 = new Rect();
                    layoutInflaterFactory2C0545Ef.d0 = new Rect();
                }
                Rect rect = layoutInflaterFactory2C0545Ef.c0;
                Rect rect2 = layoutInflaterFactory2C0545Ef.d0;
                rect.set(c5389fq4.b(), c5389fq4.d(), c5389fq4.c(), c5389fq4.a());
                ViewGroup viewGroup = layoutInflaterFactory2C0545Ef.A;
                Method method = He4.a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception unused) {
                    }
                }
                int i = rect.top;
                int i2 = rect.left;
                int i3 = rect.right;
                C5389fq4 f = Ec4.f(layoutInflaterFactory2C0545Ef.A);
                int b = f == null ? 0 : f.b();
                int c = f == null ? 0 : f.c();
                if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i;
                    marginLayoutParams.leftMargin = i2;
                    marginLayoutParams.rightMargin = i3;
                    z2 = true;
                }
                Context context = layoutInflaterFactory2C0545Ef.j;
                if (i > 0 && layoutInflaterFactory2C0545Ef.C == null) {
                    View view2 = new View(context);
                    layoutInflaterFactory2C0545Ef.C = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b;
                    layoutParams.rightMargin = c;
                    layoutInflaterFactory2C0545Ef.A.addView(layoutInflaterFactory2C0545Ef.C, -1, layoutParams);
                } else {
                    View view3 = layoutInflaterFactory2C0545Ef.C;
                    if (view3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                        int i4 = marginLayoutParams2.height;
                        int i5 = marginLayoutParams.topMargin;
                        if (i4 != i5 || marginLayoutParams2.leftMargin != b || marginLayoutParams2.rightMargin != c) {
                            marginLayoutParams2.height = i5;
                            marginLayoutParams2.leftMargin = b;
                            marginLayoutParams2.rightMargin = c;
                            layoutInflaterFactory2C0545Ef.C.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view4 = layoutInflaterFactory2C0545Ef.C;
                z = view4 != null;
                if (z && view4.getVisibility() != 0) {
                    View view5 = layoutInflaterFactory2C0545Ef.C;
                    if ((view5.getWindowSystemUiVisibility() & 8192) != 0) {
                        Object obj = Y50.a;
                        color = context.getColor(R.color.0_resource_name_obfuscated_res_0x7f070006);
                    } else {
                        Object obj2 = Y50.a;
                        color = context.getColor(R.color.0_resource_name_obfuscated_res_0x7f070005);
                    }
                    view5.setBackgroundColor(color);
                }
                if (!layoutInflaterFactory2C0545Ef.H && z) {
                    d2 = 0;
                }
                r9 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                r9 = false;
                z = false;
            }
            if (r9) {
                layoutInflaterFactory2C0545Ef.u.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = layoutInflaterFactory2C0545Ef.C;
        if (view6 != null) {
            view6.setVisibility(z ? 0 : 8);
        }
        if (d != d2) {
            int b2 = c5389fq4.b();
            int c2 = c5389fq4.c();
            int a = c5389fq4.a();
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 30) {
                c11563xp4 = new Gp4(c5389fq42);
            } else if (i6 >= 29) {
                c11563xp4 = new Ep4(c5389fq42);
            } else {
                c11563xp4 = new C11563xp4(c5389fq42);
            }
            c11563xp4.g(C2141Qm1.b(b2, d2, c2, a));
            c5389fq42 = c11563xp4.b();
        }
        return Ec4.h(view, c5389fq42);
    }
}
