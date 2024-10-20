package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xO0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11409xO0 implements InterfaceC3984bl3 {
    @Override // defpackage.InterfaceC3984bl3
    public final Exception a(Status status) {
        int i = status.g;
        int i2 = status.g;
        String str = status.h;
        if (i == 8) {
            if (str == null) {
                str = CY.a(i2);
            }
            return new C11066wO0(str);
        }
        if (str == null) {
            str = CY.a(i2);
        }
        return new C5573gO0(str);
    }
}
