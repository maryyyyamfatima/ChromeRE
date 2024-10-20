package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: h20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5799h20 implements InterfaceC7041kf4 {
    public static final C4767e20 p = new C4767e20();
    public static final C5111f20 q = new C5111f20();
    public final RectF a;
    public final RectF b;
    public final InterfaceC5455g20 c;
    public int d;
    public int e;
    public int f;
    public int g;
    public float h;
    public float i;
    public boolean j;
    public boolean k;
    public boolean l;
    public final boolean m;
    public String n;
    public String o;

    public C5799h20(Context context, float f, float f2, InterfaceC5455g20 interfaceC5455g20) {
        RectF rectF = new RectF();
        this.a = rectF;
        this.b = new RectF();
        rectF.set(0.0f, 0.0f, f, f2);
        this.h = 1.0f;
        this.j = false;
        this.k = true;
        this.l = false;
        this.m = true;
        Resources resources = context.getResources();
        this.i = resources.getDimension(R.dimen.f29570_resource_name_obfuscated_res_0x7f08011e) * (1.0f / resources.getDisplayMetrics().density);
        this.c = interfaceC5455g20;
    }

    public void e() {
        this.d = R.drawable.f45200_resource_name_obfuscated_res_0x7f0900d7;
        this.e = R.drawable.f45200_resource_name_obfuscated_res_0x7f0900d7;
        this.f = R.drawable.f51110_resource_name_obfuscated_res_0x7f090373;
        this.g = R.drawable.f51110_resource_name_obfuscated_res_0x7f090373;
    }

    @Override // defpackage.InterfaceC7041kf4
    public final String d() {
        return this.l ? this.o : this.n;
    }

    @Override // defpackage.InterfaceC7041kf4
    public final void b(RectF rectF) {
        rectF.set(this.a);
        float f = this.i;
        rectF.inset((int) (-f), (int) (-f));
    }

    public final void f(float f) {
        RectF rectF = this.a;
        rectF.right = rectF.width() + f;
        rectF.left = f;
    }

    @Override // defpackage.InterfaceC7041kf4
    public final boolean c(float f, float f2) {
        if (this.h < 1.0f || !this.k || !this.m) {
            return false;
        }
        RectF rectF = this.b;
        rectF.set(this.a);
        float f3 = this.i;
        rectF.inset(-f3, -f3);
        return rectF.contains(f, f2);
    }

    @Override // defpackage.InterfaceC7041kf4
    public final void a(long j) {
        this.c.a(j);
    }
}
