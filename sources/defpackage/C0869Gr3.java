package defpackage;

import J.N;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.survey.SurveyHttpClientBridge;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Gr3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0869Gr3 implements AutoCloseable {
    public final SurveyHttpClientBridge a;

    public C0869Gr3(Profile profile) {
        this.a = new SurveyHttpClientBridge(profile);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [Er3] */
    public final void b(final Z91 z91, final InterfaceC10960w40 interfaceC10960w40) {
        final HashMap hashMap = new HashMap();
        C0172Bi1 listIterator = z91.c.listIterator(0);
        while (listIterator.hasNext()) {
            U91 u91 = (U91) listIterator.next();
            hashMap.put(u91.a, u91.b);
        }
        final ?? r1 = new InterfaceC11646y40() { // from class: Er3
            @Override // defpackage.InterfaceC11646y40
            public final void accept(Object obj) {
                SurveyHttpClientBridge.HttpResponse httpResponse = (SurveyHttpClientBridge.HttpResponse) obj;
                int i = httpResponse.b;
                if (i == 0 || i == -379) {
                    i = httpResponse.a;
                }
                InterfaceC10960w40.this.a(new C4259ca1(i, httpResponse.d, httpResponse.c));
            }
        };
        PostTask.c(AbstractC5103f04.b, new Runnable() { // from class: Fr3
            @Override // java.lang.Runnable
            public final void run() {
                C0869Gr3 c0869Gr3 = C0869Gr3.this;
                c0869Gr3.getClass();
                Z91 z912 = z91;
                GURL a = AbstractC10615v34.a(z912.a.toString());
                byte[] bArr = z912.b;
                SurveyHttpClientBridge surveyHttpClientBridge = c0869Gr3.a;
                surveyHttpClientBridge.getClass();
                Object obj = ThreadUtils.a;
                Map map = hashMap;
                String[] strArr = (String[]) map.keySet().toArray(new String[map.keySet().size()]);
                String[] strArr2 = new String[strArr.length];
                for (int i = 0; i < strArr.length; i++) {
                    strArr2[i] = (String) map.get(strArr[i]);
                }
                long j = surveyHttpClientBridge.a;
                final InterfaceC11646y40 interfaceC11646y40 = r1;
                Objects.requireNonNull(interfaceC11646y40);
                N.MSLvVThq(j, a, "POST", bArr, strArr, strArr2, new Callback() { // from class: Dr3
                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj2) {
                        InterfaceC11646y40.this.accept((SurveyHttpClientBridge.HttpResponse) obj2);
                    }

                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj2) {
                        return new ZE(this, obj2);
                    }
                });
            }
        });
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        N.MGIxUF$3(this.a.a);
    }
}
