package defpackage;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Py1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2071Py1 extends ThreadPoolExecutor {
    public C2071Py1() {
        super(2, 2, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC1811Ny1());
    }
}
