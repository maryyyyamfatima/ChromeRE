package defpackage;

import android.content.Context;
import android.media.session.MediaSessionManager$RemoteUserInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uR1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10396uR1 extends C9710sR1 {
    @Override // defpackage.AbstractC9367rR1, defpackage.InterfaceC9025qR1
    public final void f(JR1 jr1) {
    }

    public C10396uR1(Context context, String str) {
        super(context, str);
    }

    @Override // defpackage.AbstractC9367rR1, defpackage.InterfaceC9025qR1
    public final JR1 g() {
        MediaSessionManager$RemoteUserInfo currentControllerInfo;
        currentControllerInfo = this.a.getCurrentControllerInfo();
        return new JR1(currentControllerInfo);
    }
}
