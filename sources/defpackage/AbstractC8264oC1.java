package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.RenderFrameHost;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oC1 */
/* loaded from: classes.dex */
public abstract class AbstractC8264oC1 {
    public static void c(Callback callback, Tab tab) {
        if (!((tab.b() == null || tab.b().O() == null || tab.getUrl().k() || tab.n() || C8693pT2.W0(tab)) ? false : true)) {
            callback.onResult("");
        } else {
            tab.b().O().h(new C7232lC1(callback));
        }
    }

    public static String b(String str, String str2) {
        return !str2.isEmpty() ? Uri.parse(str).buildUpon().encodedFragment(":~:text=".concat(str2)).toString() : str;
    }

    public static void a(final List list, final List list2, final Callback callback, final int i) {
        if (i >= list2.size()) {
            StringBuilder sb = new StringBuilder();
            Iterator it = list.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb.append((CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    } else {
                        sb.append((CharSequence) "&text=");
                    }
                }
            }
            callback.onResult(sb.toString());
            return;
        }
        final InterfaceC3828bI3 interfaceC3828bI3 = (InterfaceC3828bI3) ((RenderFrameHost) list2.get(i)).e(AbstractC11382xI3.a);
        if (interfaceC3828bI3 == null) {
            a(list, list2, callback, i + 1);
        }
        ((C4515dI3) interfaceC3828bI3).e(new C7576mC1(new Callback() { // from class: iC1
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                String[] strArr = (String[]) obj;
                int length = strArr.length;
                List list3 = list;
                if (length > 0) {
                    list3.addAll(Arrays.asList(strArr));
                }
                AbstractC8264oC1.a(list3, list2, callback, i + 1);
                ((AbstractC6411ip1) interfaceC3828bI3).close();
            }
        }));
    }
}
