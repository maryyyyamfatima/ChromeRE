package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rq3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9510rq3 implements InterfaceC0987Hp1 {
    @Override // defpackage.InterfaceC0987Hp1
    public final Object a(Object obj) {
        EnumC10196tq3 enumC10196tq3;
        int intValue = ((Integer) obj).intValue();
        if (intValue == 0) {
            enumC10196tq3 = EnumC10196tq3.g;
        } else if (intValue == 1) {
            enumC10196tq3 = EnumC10196tq3.h;
        } else {
            enumC10196tq3 = intValue != 2 ? null : EnumC10196tq3.i;
        }
        return enumC10196tq3 == null ? EnumC10196tq3.j : enumC10196tq3;
    }
}
