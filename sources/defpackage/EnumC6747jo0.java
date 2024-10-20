package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jo0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC6747jo0 implements Executor {
    public static final EnumC6747jo0 a;
    public static final /* synthetic */ EnumC6747jo0[] g;

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }

    public static EnumC6747jo0[] values() {
        return (EnumC6747jo0[]) g.clone();
    }

    static {
        EnumC6747jo0 enumC6747jo0 = new EnumC6747jo0();
        a = enumC6747jo0;
        g = new EnumC6747jo0[]{enumC6747jo0};
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
