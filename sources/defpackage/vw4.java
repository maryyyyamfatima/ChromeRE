package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class vw4 implements InterfaceC7481lv4 {
    public final /* synthetic */ Zs4 a;
    public final /* synthetic */ Intent b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ Bw4 d;

    public vw4(Bw4 bw4, Zs4 zs4, Intent intent, Context context) {
        this.d = bw4;
        this.a = zs4;
        this.b = intent;
        this.c = context;
    }

    @Override // defpackage.InterfaceC7481lv4
    public final void a() {
        Bw4 bw4 = this.d;
        bw4.g.post(new zw4(bw4, this.a, 5, 0));
    }

    @Override // defpackage.InterfaceC7481lv4
    public final void b() {
        Intent intent = this.b;
        if (intent.getBooleanExtra("triggered_from_app_after_verification", false)) {
            this.d.a.b(6, "Splits copied and verified more than once.", new Object[0]);
        } else {
            intent.putExtra("triggered_from_app_after_verification", true);
            this.c.sendBroadcast(intent);
        }
    }

    @Override // defpackage.InterfaceC7481lv4
    public final void c(int i) {
        Bw4 bw4 = this.d;
        bw4.g.post(new zw4(bw4, this.a, 6, i));
    }
}
