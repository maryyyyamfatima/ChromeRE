package defpackage;

import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: j61, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC6510j61 implements Callable {
    public static final EnumC6510j61 a;
    public static final /* synthetic */ EnumC6510j61[] g;

    public static EnumC6510j61[] values() {
        return (EnumC6510j61[]) g.clone();
    }

    static {
        EnumC6510j61 enumC6510j61 = new EnumC6510j61();
        a = enumC6510j61;
        g = new EnumC6510j61[]{enumC6510j61};
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return new HashMap();
    }
}
