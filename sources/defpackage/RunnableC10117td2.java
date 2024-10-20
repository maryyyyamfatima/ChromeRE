package defpackage;

import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: td2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC10117td2 implements Runnable {
    public InterfaceC2909Wk a;
    public Executor g;

    public RunnableC10117td2(InterfaceC2909Wk interfaceC2909Wk, Executor executor) {
        this.a = interfaceC2909Wk;
        this.g = executor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a = null;
        this.g = null;
    }
}
