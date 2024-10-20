package defpackage;

import java.util.logging.Level;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: j31, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6492j31 extends E {
    public static final C6150i31 b = new C6150i31();

    public static C6492j31 j() {
        return new C6492j31(AbstractC2312Ru2.b(AbstractC2312Ru2.d().b(C6492j31.class)));
    }

    public static C6492j31 k(String str) {
        if (!(!str.isEmpty())) {
            throw new IllegalArgumentException("injected class name is empty");
        }
        return new C6492j31(AbstractC2312Ru2.b(str.replace('/', '.')));
    }

    public C6492j31(AbstractC6232iI1 abstractC6232iI1) {
        super(abstractC6232iI1);
    }

    @Override // defpackage.E
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final InterfaceC5462g31 a(Level level) {
        boolean g = g(level);
        boolean o = AbstractC2312Ru2.o(this.a.a(), level, g);
        if (!g && !o) {
            return b;
        }
        return new C5806h31(this, level, o);
    }
}
