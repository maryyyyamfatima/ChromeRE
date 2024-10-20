package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.android.chrome.R;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uT1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10406uT1 {
    public final Context a;
    public final BS1 b;
    public final boolean c;
    public final int d;
    public final int e;
    public View f;
    public int g;
    public boolean h;
    public InterfaceC11778yT1 i;
    public AbstractC9720sT1 j;
    public PopupWindow.OnDismissListener k;
    public final C10063tT1 l;

    public C10406uT1(Context context, BS1 bs1, View view, boolean z) {
        this(R.attr.f2430_resource_name_obfuscated_res_0x7f050020, 0, context, view, bs1, z);
    }

    public C10406uT1(int i, int i2, Context context, View view, BS1 bs1, boolean z) {
        this.g = 8388611;
        this.l = new C10063tT1(this);
        this.a = context;
        this.b = bs1;
        this.f = view;
        this.c = z;
        this.d = i;
        this.e = i2;
    }

    public final AbstractC9720sT1 a() {
        AbstractC9720sT1 viewOnKeyListenerC2383Si3;
        if (this.j == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.f27340_resource_name_obfuscated_res_0x7f080016)) {
                viewOnKeyListenerC2383Si3 = new TG(this.a, this.f, this.d, this.e, this.c);
            } else {
                viewOnKeyListenerC2383Si3 = new ViewOnKeyListenerC2383Si3(this.d, this.e, this.a, this.f, this.b, this.c);
            }
            viewOnKeyListenerC2383Si3.l(this.b);
            viewOnKeyListenerC2383Si3.r(this.l);
            viewOnKeyListenerC2383Si3.n(this.f);
            viewOnKeyListenerC2383Si3.h(this.i);
            viewOnKeyListenerC2383Si3.o(this.h);
            viewOnKeyListenerC2383Si3.p(this.g);
            this.j = viewOnKeyListenerC2383Si3;
        }
        return this.j;
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        AbstractC9720sT1 a = a();
        a.s(z2);
        if (z) {
            int i3 = this.g;
            View view = this.f;
            WeakHashMap weakHashMap = Ec4.a;
            if ((Gravity.getAbsoluteGravity(i3, view.getLayoutDirection()) & 7) == 5) {
                i -= this.f.getWidth();
            }
            a.q(i);
            a.t(i2);
            int i4 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a.a = new Rect(i - i4, i2 - i4, i + i4, i2 + i4);
        }
        a.b();
    }

    public void c() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final boolean b() {
        AbstractC9720sT1 abstractC9720sT1 = this.j;
        return abstractC9720sT1 != null && abstractC9720sT1.a();
    }
}
