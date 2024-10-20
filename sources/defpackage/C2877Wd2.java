package defpackage;

import J.N;
import android.view.View;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import org.chromium.chrome.browser.feed.FeedStream;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Wd2 */
/* loaded from: classes.dex */
public final class C2877Wd2 implements InterfaceC9395rX {
    @Override // defpackage.InterfaceC9395rX
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.InterfaceC9395rX
    public final VY c(Object obj, AbstractC9053qX abstractC9053qX) {
        C3007Xd2 c3007Xd2 = (C3007Xd2) obj;
        InterfaceC2548Tp3 c = L44.c(abstractC9053qX);
        if (c == null) {
            return new C6315iZ(new IllegalArgumentException("actionsHandler not present in CommandEventData"));
        }
        C3597ae2 c3597ae2 = c3007Xd2.k;
        if (c3597ae2 == null) {
            c3597ae2 = C3597ae2.p;
        }
        int a = AbstractC3137Yd2.a(c3597ae2.m);
        if (a == 0) {
            a = 2;
        }
        switch (AbstractC2373Sg3.b(a)) {
            case 1:
                C3597ae2 c3597ae22 = c3007Xd2.k;
                if (c3597ae22 == null) {
                    c3597ae22 = C3597ae2.p;
                }
                ((C6241iK0) c).b(((C2924Wn) abstractC9053qX).a, c3597ae22.l);
                break;
            case 2:
                C3597ae2 c3597ae23 = c3007Xd2.k;
                if (c3597ae23 == null) {
                    c3597ae23 = C3597ae2.p;
                }
                String str = c3597ae23.l;
                View view = ((C2924Wn) abstractC9053qX).a;
                C6241iK0 c6241iK0 = (C6241iK0) c;
                FeedStream feedStream = c6241iK0.b;
                N.MTNNqlMO(feedStream.d, feedStream, (GURL) feedStream.a.apply(str), feedStream.e(view));
                c6241iK0.c(4, str);
                feedStream.f(feedStream.o);
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                C3597ae2 c3597ae24 = c3007Xd2.k;
                if (c3597ae24 == null) {
                    c3597ae24 = C3597ae2.p;
                }
                String str2 = c3597ae24.l;
                C6241iK0 c6241iK02 = (C6241iK0) c;
                FeedStream feedStream2 = c6241iK02.b;
                N.MakGUIs_(feedStream2.d, feedStream2, 11);
                c6241iK02.c(8, str2);
                feedStream2.f(feedStream2.o);
                break;
            case 4:
                C3597ae2 c3597ae25 = c3007Xd2.k;
                if (c3597ae25 == null) {
                    c3597ae25 = C3597ae2.p;
                }
                String str3 = c3597ae25.l;
                C6241iK0 c6241iK03 = (C6241iK0) c;
                FeedStream feedStream3 = c6241iK03.b;
                N.MakGUIs_(feedStream3.d, feedStream3, 7);
                ((UI0) c6241iK03.a).getClass();
                NN2.a(Profile.d()).b(str3, "ntp_suggestions");
                break;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                C3597ae2 c3597ae26 = c3007Xd2.k;
                C3941be2 c3941be2 = (c3597ae26 == null ? C3597ae2.p : c3597ae26).n;
                if (c3941be2 == null) {
                    c3941be2 = C3941be2.l;
                }
                final String str4 = c3941be2.k;
                if (c3597ae26 == null) {
                    c3597ae26 = C3597ae2.p;
                }
                final String str5 = c3597ae26.l;
                C6241iK0 c6241iK04 = (C6241iK0) c;
                FeedStream feedStream4 = c6241iK04.b;
                N.MakGUIs_(feedStream4.d, feedStream4, 41);
                final UI0 ui0 = (UI0) c6241iK04.a;
                ui0.getClass();
                ui0.b.e(new Runnable() { // from class: RI0
                    @Override // java.lang.Runnable
                    public final void run() {
                        UI0 ui02 = UI0.this;
                        ui02.getClass();
                        WA.b(new GURL(str5), str4, ui02.d, ui02.b, ui02.c);
                    }
                });
                break;
            case 6:
                C3597ae2 c3597ae27 = c3007Xd2.k;
                if (c3597ae27 == null) {
                    c3597ae27 = C3597ae2.p;
                }
                String str6 = c3597ae27.l;
                C6241iK0 c6241iK05 = (C6241iK0) c;
                FeedStream feedStream5 = c6241iK05.b;
                N.MakGUIs_(feedStream5.d, feedStream5, 53);
                UI0 ui02 = (UI0) c6241iK05.a;
                ui02.getClass();
                ui02.e.c(ui02.c, new GURL(str6), GURL.emptyGURL(), true);
                break;
        }
        return C5971hZ.a;
    }

    @Override // defpackage.InterfaceC9395rX
    public final VF0 a() {
        return C3007Xd2.o;
    }
}
