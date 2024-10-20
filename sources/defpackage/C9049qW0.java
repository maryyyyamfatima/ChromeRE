package defpackage;

import android.os.Bundle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qW0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9049qW0 implements InterfaceC10420uW0 {
    @Override // defpackage.InterfaceC10420uW0
    public final void a(Object obj, String str, String str2) {
        ((Bundle) obj).putString(str, str2);
    }

    @Override // defpackage.InterfaceC10420uW0
    public final void c(Object obj, String[] strArr) {
        ((Bundle) obj).putStringArray("data", strArr);
    }

    @Override // defpackage.InterfaceC10420uW0
    public final Object b() {
        return new Bundle();
    }
}
