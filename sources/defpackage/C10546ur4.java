package defpackage;

import android.app.Application;
import android.content.Context;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ur4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10546ur4 {
    public final C5258fU a;
    public final String b;
    public final EnumC6432is4 c;
    public final Mr4 d;
    public final C7261lI0 e;

    public C10546ur4(Context context, InterfaceScheduledExecutorServiceC4493dE1 interfaceScheduledExecutorServiceC4493dE1, EnumC6432is4 enumC6432is4, Mr4 mr4, C3242Yy2 c3242Yy2) {
        Context applicationContext = context.getApplicationContext();
        this.a = new C5258fU(interfaceScheduledExecutorServiceC4493dE1, new ST(context), applicationContext instanceof Application ? (Application) applicationContext : null);
        this.b = context.getPackageName();
        this.c = enumC6432is4;
        this.d = mr4;
        this.e = (C7261lI0) c3242Yy2.a;
    }
}
