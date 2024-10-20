package defpackage;

import J.N;
import android.util.Printer;
import org.chromium.base.EarlyTraceEvent;
import org.chromium.base.TraceEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ST3 implements Printer {
    public String a;

    @Override // android.util.Printer
    public final void println(String str) {
        if (str.startsWith(">")) {
            a(str);
        } else {
            b(str);
        }
    }

    public void a(String str) {
        String a;
        boolean e = EarlyTraceEvent.e();
        if (TraceEvent.g || e) {
            if (TraceEvent.j) {
                a = "Looper.dispatch: EVENT_NAME_FILTERED";
            } else {
                StringBuilder sb = new StringBuilder("Looper.dispatch: ");
                int indexOf = str.indexOf(40, 18);
                int indexOf2 = indexOf == -1 ? -1 : str.indexOf(41, indexOf);
                sb.append(indexOf2 != -1 ? str.substring(indexOf + 1, indexOf2) : "");
                sb.append("(");
                int indexOf3 = str.indexOf(125, 18);
                int indexOf4 = indexOf3 == -1 ? -1 : str.indexOf(58, indexOf3);
                if (indexOf4 == -1) {
                    indexOf4 = str.length();
                }
                a = Y5.a(sb, indexOf3 != -1 ? str.substring(indexOf3 + 2, indexOf4) : "", ")");
            }
            this.a = a;
            if (TraceEvent.g) {
                N.M_y76mct(this.a);
            } else {
                EarlyTraceEvent.a(this.a, true);
            }
        }
    }

    public void b(String str) {
        boolean e = EarlyTraceEvent.e();
        if ((TraceEvent.g || e) && this.a != null) {
            if (TraceEvent.g) {
                N.MLJecZJ9(this.a);
            } else {
                EarlyTraceEvent.f(this.a, true);
            }
        }
        this.a = null;
    }
}
