package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oq3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8482oq3 implements InterfaceC0987Hp1 {
    @Override // defpackage.InterfaceC0987Hp1
    public final Object a(Object obj) {
        EnumC8825pq3 enumC8825pq3;
        int intValue = ((Integer) obj).intValue();
        if (intValue == 0) {
            enumC8825pq3 = EnumC8825pq3.g;
        } else if (intValue == 1) {
            enumC8825pq3 = EnumC8825pq3.h;
        } else {
            enumC8825pq3 = intValue != 2 ? null : EnumC8825pq3.i;
        }
        return enumC8825pq3 == null ? EnumC8825pq3.j : enumC8825pq3;
    }
}
