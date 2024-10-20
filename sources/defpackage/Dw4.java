package defpackage;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Dw4 implements Runnable {
    public final /* synthetic */ C2638Uh3 a;
    public final /* synthetic */ Fw4 g;

    public Dw4(Fw4 fw4, C2638Uh3 c2638Uh3) {
        this.g = fw4;
        this.a = c2638Uh3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bw4 bw4 = this.g.b;
        C2638Uh3 c2638Uh3 = this.a;
        ArrayList arrayList = c2638Uh3.a;
        ArrayList h = Fw4.h(c2638Uh3.b);
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", 0);
        bundle.putInt("status", 5);
        bundle.putInt("error_code", 0);
        if (!arrayList.isEmpty()) {
            bundle.putStringArrayList("module_names", new ArrayList<>(arrayList));
        }
        if (!h.isEmpty()) {
            bundle.putStringArrayList("languages", new ArrayList<>(h));
        }
        bundle.putLong("total_bytes_to_download", 0L);
        bundle.putLong("bytes_downloaded", 0L);
        bw4.d(Zs4.b(bundle));
    }
}
