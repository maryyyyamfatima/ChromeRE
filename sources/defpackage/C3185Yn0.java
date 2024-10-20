package defpackage;

import j$.util.function.Consumer;
import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Yn0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3185Yn0 {
    public final Consumer a;
    public final HashMap b = new HashMap();
    public final /* synthetic */ C3655ao0 c;

    public C3185Yn0(C3655ao0 c3655ao0, Consumer consumer) {
        this.c = c3655ao0;
        this.a = consumer;
    }

    public final C3055Xn0 a(String str) {
        C3055Xn0 c3055Xn0 = new C3055Xn0(str);
        this.b.put(str, c3055Xn0);
        return c3055Xn0;
    }
}
