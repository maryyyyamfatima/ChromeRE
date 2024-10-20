package defpackage;

import J.N;
import android.os.Bundle;
import java.io.IOException;
import org.chromium.components.gcm_driver.GCMDriver;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oW0 */
/* loaded from: classes2.dex */
public final class C8363oW0 extends AbstractC0185Bl {
    public final /* synthetic */ String h;
    public final /* synthetic */ String i;
    public final /* synthetic */ GCMDriver j;

    public C8363oW0(GCMDriver gCMDriver, String str, String str2) {
        this.j = gCMDriver;
        this.h = str;
        this.i = str2;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        GCMDriver gCMDriver = this.j;
        N.MDziew73(gCMDriver.a, gCMDriver, this.h, ((Boolean) obj).booleanValue());
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        String str = this.i;
        String str2 = this.h;
        try {
            K21 k21 = this.j.b;
            k21.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("subtype", str2);
            bundle.putString("delete", "1");
            k21.a(str, bundle);
            return Boolean.TRUE;
        } catch (IOException e) {
            AbstractC4851eH1.f("GCMDriver", IR0.a("GCM unsubscription failed for ", str2, ", ", str), e);
            return Boolean.FALSE;
        }
    }
}
