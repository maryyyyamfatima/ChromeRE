package defpackage;

import android.content.Context;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.TimeUnit;
import org.chromium.base.TraceEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: aO */
/* loaded from: classes.dex */
public abstract class AbstractC3510aO implements ZN {
    public final Context a;
    public final AbstractC10600v11 b;
    public final C4502dG0 c = C4502dG0.b;

    public AbstractC3510aO(Context context, N11 n11) {
        this.a = context.getApplicationContext();
        this.b = n11;
    }

    public final boolean a() {
        TraceEvent.b("ChromeGoogleApiClientImpl:connectWithTimeout", null);
        try {
            ConnectionResult d = this.b.d(TimeUnit.MILLISECONDS);
            if (!d.t1()) {
                AbstractC4851eH1.a("Icing", "Connection to GmsCore unsuccessful. Error %d", Integer.valueOf(d.g));
            }
            return d.t1();
        } finally {
            TraceEvent.c("ChromeGoogleApiClientImpl:connectWithTimeout");
        }
    }
}
