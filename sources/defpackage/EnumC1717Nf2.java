package defpackage;

import java.util.EnumSet;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 Nf2, still in use, count: 1, list:
  (r0v0 Nf2) from 0x0043: INVOKE (r0v0 Nf2) STATIC call: java.util.EnumSet.of(java.lang.Enum):java.util.EnumSet A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>):java.util.EnumSet<E extends java.lang.Enum<E>> (c), WRAPPED] (LINE:24)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
	at java.base/java.util.ArrayList.forEach(Unknown Source)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:238)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Nf2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1717Nf2 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("ZWIEBACK"),
    g("ANDROID_ID"),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("GAIA"),
    h("ACCOUNT_NAME");

    public static final EnumSet i = EnumSet.allOf(EnumC1717Nf2.class);
    public static final EnumSet j = EnumSet.noneOf(EnumC1717Nf2.class);
    public static final EnumSet k = EnumSet.of(new EnumC1717Nf2("ZWIEBACK"));
    public final int a;

    public static EnumC1717Nf2[] values() {
        return (EnumC1717Nf2[]) l.clone();
    }

    static {
    }

    public EnumC1717Nf2(String str) {
        this.a = r2;
    }
}
