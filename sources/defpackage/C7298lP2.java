package defpackage;

import java.util.LinkedHashSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lP2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7298lP2 implements InterfaceC4062bz0 {
    public static final C6492j31 d = C6492j31.j();
    public final InterfaceC9989tE2 a;
    public final InterfaceExecutorServiceC4149cE1 b;
    public final LinkedHashSet c;

    public C7298lP2(InterfaceC9989tE2 interfaceC9989tE2, InterfaceExecutorServiceC4149cE1 interfaceExecutorServiceC4149cE1) {
        AbstractC0087Ar1.e(interfaceC9989tE2, "resourceLoader");
        AbstractC0087Ar1.e(interfaceExecutorServiceC4149cE1, "blockingExecutor");
        this.a = interfaceC9989tE2;
        this.b = interfaceExecutorServiceC4149cE1;
        this.c = new LinkedHashSet();
    }
}
