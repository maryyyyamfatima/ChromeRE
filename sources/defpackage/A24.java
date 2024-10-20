package defpackage;

import J.N;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import j$.util.Optional;
import j$.util.function.Consumer;
import java.io.UnsupportedEncodingException;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.feed.webfeed.WebFeedBridge$FollowResults;
import org.chromium.chrome.browser.feed.webfeed.WebFeedBridge$UnfollowResults;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class A24 {
    public static VY a(InterfaceC9738sX interfaceC9738sX, AbstractC9053qX abstractC9053qX, boolean z, String str, boolean z2, Optional optional, Optional optional2) {
        if (L44.c(abstractC9053qX) != null) {
            final C11981z24 c11981z24 = new C11981z24(str, z, z2, optional, new Consumer() { // from class: y24
                public final /* synthetic */ AbstractC9053qX b;

                public /* synthetic */ C11638y24(AbstractC9053qX abstractC9053qX2) {
                    r2 = abstractC9053qX2;
                }

                @Override // j$.util.function.Consumer
                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer.CC.$default$andThen(this, consumer);
                }

                @Override // j$.util.function.Consumer
                public final void accept(Object obj) {
                    ((C10081tX) InterfaceC9738sX.this).a((CommandOuterClass$Command) obj, r2, 2).c();
                }
            }, optional2);
            try {
                byte[] bytes = str.getBytes("UTF8");
                if (z) {
                    N.MtL148iF(bytes, z2, 0, new Callback() { // from class: fK0
                        @Override // org.chromium.base.Callback
                        public final ZE e0(Object obj) {
                            return new ZE(this, obj);
                        }

                        @Override // org.chromium.base.Callback
                        public final void onResult(Object obj) {
                            C11981z24 c11981z242 = C11981z24.this;
                            Optional optional3 = c11981z242.a;
                            boolean z3 = ((WebFeedBridge$FollowResults) obj).a == 1;
                            Consumer consumer = c11981z242.b;
                            if (z3) {
                                optional3.ifPresent(consumer);
                            } else {
                                c11981z242.c.ifPresent(consumer);
                            }
                        }
                    });
                } else {
                    N.MVWVyQhp(bytes, z2, 0, new Callback() { // from class: gK0
                        @Override // org.chromium.base.Callback
                        public final ZE e0(Object obj) {
                            return new ZE(this, obj);
                        }

                        @Override // org.chromium.base.Callback
                        public final void onResult(Object obj) {
                            C11981z24 c11981z242 = C11981z24.this;
                            Optional optional3 = c11981z242.a;
                            boolean z3 = ((WebFeedBridge$UnfollowResults) obj).a == 1;
                            Consumer consumer = c11981z242.b;
                            if (z3) {
                                optional3.ifPresent(consumer);
                            } else {
                                c11981z242.c.ifPresent(consumer);
                            }
                        }
                    });
                }
            } catch (UnsupportedEncodingException e) {
                AbstractC4851eH1.d("FeedStream", "Invalid webFeedName", e);
            }
            return C5971hZ.a;
        }
        return new C6315iZ(new IllegalArgumentException("surfaceActionsHandler not present in CommandEventData"));
    }
}
