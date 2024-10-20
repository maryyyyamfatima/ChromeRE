package defpackage;

import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.background_task_scheduler.ChromeBackgroundTaskFactory;
import org.chromium.chrome.browser.explore_sites.ExploreSitesBackgroundTask;
import org.chromium.chrome.browser.notifications.scheduler.NotificationSchedulerTask;
import org.chromium.chrome.browser.offlinepages.prefetch.PrefetchBackgroundTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mt */
/* loaded from: classes2.dex */
public abstract class AbstractC7808mt {
    public static C9524rt a;
    public static ChromeBackgroundTaskFactory b;

    public static C9524rt b() {
        Object obj = ThreadUtils.a;
        if (a == null) {
            a = new C9524rt(new C11239wt(), new C6776jt());
        }
        return a;
    }

    public static InterfaceC2689Us a(int i) {
        InterfaceC2689Us c7331lW0;
        b.getClass();
        if (i == 1) {
            c7331lW0 = new C7331lW0();
        } else if (i == 2) {
            c7331lW0 = new C10266u24();
        } else if (i == 53 || i == 54 || i == 56 || i == 57) {
            c7331lW0 = new C3330Zq0();
        } else if (i == 77) {
            c7331lW0 = new C0523Ea2();
        } else if (i == 78) {
            c7331lW0 = new PrefetchBackgroundTask();
        } else if (i == 91) {
            c7331lW0 = new Zk4();
        } else {
            if (i != 109) {
                if (i == 71300) {
                    c7331lW0 = new C3929bc2(V60.a);
                } else {
                    switch (i) {
                        case 100:
                        case 101:
                            c7331lW0 = new ExploreSitesBackgroundTask();
                            break;
                        case 102:
                            c7331lW0 = new C2169Qs();
                            break;
                        case 103:
                            c7331lW0 = new NotificationSchedulerTask();
                            break;
                        case 104:
                            c7331lW0 = new S72();
                            break;
                        case 105:
                            c7331lW0 = new C11573xr2();
                            break;
                        case 106:
                        case 107:
                            break;
                        default:
                            AbstractC4851eH1.f("ChromeBkgrdTaskF", AbstractC9076qb1.a("Unable to find BackgroundTask class for task id ", i), new Object[0]);
                            c7331lW0 = null;
                            break;
                    }
                }
            }
            c7331lW0 = new FE2();
        }
        if (c7331lW0 instanceof S02) {
            ((S02) c7331lW0).e = new MO();
        }
        return c7331lW0;
    }
}
