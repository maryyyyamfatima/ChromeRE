package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wJ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC11042wJ1 implements Callable {
    public final /* synthetic */ InputStream a;
    public final /* synthetic */ String g;

    public CallableC11042wJ1(ByteArrayInputStream byteArrayInputStream, String str) {
        this.a = byteArrayInputStream;
        this.g = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return AbstractC11728yJ1.c(this.a, this.g);
    }
}
