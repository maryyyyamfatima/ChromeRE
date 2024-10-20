package defpackage;

import J.N;
import android.app.Activity;
import java.util.HashMap;
import java.util.Map;
import org.chromium.base.Callback;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.feed.FeedStream;
import org.chromium.chrome.browser.feedback.ScreenshotTask;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class A33 implements InterfaceC9395rX {
    @Override // defpackage.InterfaceC9395rX
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.InterfaceC9395rX
    public final VY c(Object obj, AbstractC9053qX abstractC9053qX) {
        B33 b33 = (B33) obj;
        if (b33 == null) {
            return new C6315iZ(new IllegalArgumentException("Invalid command parameter to SendFeedbackCommandHandler.onCommand"));
        }
        if (abstractC9053qX != null) {
            InterfaceC3486aJ0 a = L44.a(abstractC9053qX);
            if (a != null) {
                C10365uL0 c10365uL0 = b33.k;
                if (c10365uL0 == null) {
                    c10365uL0 = C10365uL0.k;
                }
                InterfaceC1377Kp1 interfaceC1377Kp1 = c10365uL0.j;
                HashMap hashMap = new HashMap();
                int size = interfaceC1377Kp1.size();
                for (int i = 0; i < size; i++) {
                    C10708vL0 c10708vL0 = (C10708vL0) interfaceC1377Kp1.get(i);
                    hashMap.put(c10708vL0.k, c10708vL0.l);
                }
                final C3835bK0 c3835bK0 = (C3835bK0) a;
                FeedStream feedStream = c3835bK0.a;
                N.MakGUIs_(feedStream.d, feedStream, 2);
                final Profile d = Profile.d();
                if (d != null) {
                    final String str = (String) hashMap.get("Card URL");
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("Card URL", "CardUrl");
                    hashMap2.put("Card Title", "CardTitle");
                    hashMap2.put("Card Snippet", "CardSnippet");
                    hashMap2.put("Card category", "CardCategory");
                    hashMap2.put("Doc Creation Date", "DocCreationDate");
                    final HashMap hashMap3 = new HashMap();
                    for (Map.Entry entry : hashMap.entrySet()) {
                        String str2 = (String) hashMap2.get(entry.getKey());
                        if (str2 != null) {
                            hashMap3.put(str2, (String) entry.getValue());
                        } else {
                            hashMap3.put((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    PostTask.b(AbstractC5103f04.a, new Runnable() { // from class: ZJ0
                        /* JADX WARN: Type inference failed for: r6v1, types: [y71] */
                        @Override // java.lang.Runnable
                        public final void run() {
                            Profile profile = d;
                            FeedStream feedStream2 = C3835bK0.this.a;
                            final C12008z71 c12008z71 = feedStream2.i;
                            final Activity activity = feedStream2.c;
                            c12008z71.getClass();
                            new C5548gJ0(activity, new ScreenshotTask(activity), new C5204fJ0(profile, str, hashMap3), new Callback() { // from class: y71
                                @Override // org.chromium.base.Callback
                                public final ZE e0(Object obj2) {
                                    return new ZE(this, obj2);
                                }

                                @Override // org.chromium.base.Callback
                                public final void onResult(Object obj2) {
                                    C12008z71.this.e(activity, (AbstractRunnableC9679sL0) obj2);
                                }
                            }, profile);
                        }
                    }, 318L);
                }
                return C5971hZ.a;
            }
            return new C6315iZ(new IllegalArgumentException("actionsHandler not present in CommandEventData"));
        }
        return new C6315iZ(new IllegalArgumentException("Invalid eventData parameter to SendFeedbackCommandHandler.onCommand"));
    }

    @Override // defpackage.InterfaceC9395rX
    public final VF0 a() {
        return B33.n;
    }
}
