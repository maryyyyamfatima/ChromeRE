package defpackage;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ev2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0628Ev2 extends AbstractC7160l0 {
    @Override // defpackage.AbstractC7160l0
    public final Random b() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        AbstractC0087Ar1.d(current, "current()");
        return current;
    }
}
