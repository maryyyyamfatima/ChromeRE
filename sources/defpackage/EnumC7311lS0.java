package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lS0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC7311lS0 {
    public static final EnumC7311lS0 j;
    public static final EnumC7311lS0[] k;
    public static final /* synthetic */ EnumC7311lS0[] l;
    public final char a;
    public final EnumC9714sS0 g;
    public final int h;
    public final String i;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC7311lS0 EF7;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC7311lS0 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC7311lS0 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC7311lS0 EF2;

    public static EnumC7311lS0[] values() {
        return (EnumC7311lS0[]) l.clone();
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:489)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:492)
        */
    static {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.EnumC7311lS0.<clinit>():void");
    }

    public EnumC7311lS0(String str, int i, char c, EnumC9714sS0 enumC9714sS0, String str2, boolean z) {
        this.a = c;
        this.g = enumC9714sS0;
        C7655mS0 c7655mS0 = C7655mS0.e;
        int i2 = z ? 128 : 0;
        for (int i3 = 0; i3 < str2.length(); i3++) {
            int charAt = ((int) ((C7655mS0.d >>> ((str2.charAt(i3) - ' ') * 3)) & 7)) - 1;
            if (charAt < 0) {
                throw new IllegalArgumentException("invalid flags: ".concat(str2));
            }
            i2 |= 1 << charAt;
        }
        this.h = i2;
        this.i = "%" + c;
    }
}
