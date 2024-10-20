package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import org.chromium.chrome.browser.notifications.NotificationIntentInterceptor$Receiver;
import org.chromium.chrome.browser.notifications.NotificationIntentInterceptor$TrampolineActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class U62 {
    public static void a(Intent intent) {
        int intExtra = intent.getIntExtra("notifications.NotificationIntentInterceptor.EXTRA_INTENT_TYPE", -1);
        int intExtra2 = intent.getIntExtra("notifications.NotificationIntentInterceptor.EXTRA_NOTIFICATION_TYPE", -1);
        long longExtra = intent.getLongExtra("notifications.NotificationIntentInterceptor.EXTRA_CREATE_TIME", -1L);
        if (intExtra == 0) {
            U72.a.getClass();
            if (intExtra2 != -1) {
                EI2.h(intExtra2, 38, "Mobile.SystemNotification.Content.Click");
                if (intExtra2 == 0) {
                    FI2.a("Mobile.SystemNotification.Content.Click.Downloads_Files");
                }
                V72.c(longExtra, "Mobile.SystemNotification.Content.Click.Age");
                if (intExtra2 == 15) {
                    V72.c(longExtra, "Mobile.SystemNotification.Content.Click.Age.SendTabToSelf");
                } else if (intExtra2 == 29) {
                    V72.c(longExtra, "Mobile.SystemNotification.Content.Click.Age.SmsFetcher");
                } else if (intExtra2 == 17) {
                    V72.c(longExtra, "Mobile.SystemNotification.Content.Click.Age.ClickToCall");
                } else if (intExtra2 == 18) {
                    V72.c(longExtra, "Mobile.SystemNotification.Content.Click.Age.SharedClipboard");
                } else if (intExtra2 == 32) {
                    V72.c(longExtra, "Mobile.SystemNotification.Content.Click.Age.PriceDropChromeManaged");
                } else if (intExtra2 == 33) {
                    V72.c(longExtra, "Mobile.SystemNotification.Content.Click.Age.PriceDropUserManaged");
                }
            }
        } else if (intExtra == 1) {
            int intExtra3 = intent.getIntExtra("notifications.NotificationIntentInterceptor.EXTRA_ACTION_TYPE", -1);
            U72.a.getClass();
            if (intExtra3 != -1) {
                EI2.h(intExtra3, 28, "Mobile.SystemNotification.Action.Click");
                V72.c(longExtra, "Mobile.SystemNotification.Action.Click.Age");
                if (intExtra2 == 15) {
                    V72.c(longExtra, "Mobile.SystemNotification.Action.Click.Age.SendTabToSelf");
                } else if (intExtra2 == 29) {
                    V72.c(longExtra, "Mobile.SystemNotification.Action.Click.Age.SmsFetcher");
                } else if (intExtra2 == 17) {
                    V72.c(longExtra, "Mobile.SystemNotification.Action.Click.Age.ClickToCall");
                } else if (intExtra2 == 18) {
                    V72.c(longExtra, "Mobile.SystemNotification.Action.Click.Age.SharedClipboard");
                } else if (intExtra2 == 32) {
                    V72.c(longExtra, "Mobile.SystemNotification.Action.Click.Age.PriceDropChromeManaged");
                } else if (intExtra2 == 33) {
                    V72.c(longExtra, "Mobile.SystemNotification.Action.Click.Age.PriceDropUserManaged");
                }
            }
        } else if (intExtra == 2) {
            U72.a.getClass();
            if (intExtra2 != -1) {
                EI2.h(intExtra2, 38, "Mobile.SystemNotification.Dismiss");
                V72.c(longExtra, "Mobile.SystemNotification.Dismiss.Age");
                if (intExtra2 == 15) {
                    V72.c(longExtra, "Mobile.SystemNotification.Dismiss.Age.SendTabToSelf");
                } else if (intExtra2 == 29) {
                    V72.c(longExtra, "Mobile.SystemNotification.Dismiss.Age.SmsFetcher");
                } else if (intExtra2 == 17) {
                    V72.c(longExtra, "Mobile.SystemNotification.Dismiss.Age.ClickToCall");
                } else if (intExtra2 == 18) {
                    V72.c(longExtra, "Mobile.SystemNotification.Dismiss.Age.SharedClipboard");
                } else if (intExtra2 == 32) {
                    V72.c(longExtra, "Mobile.SystemNotification.Dismiss.Age.PriceDropChromeManaged");
                } else if (intExtra2 == 33) {
                    V72.c(longExtra, "Mobile.SystemNotification.Dismiss.Age.PriceDropUserManaged");
                }
            }
        }
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("notifications.NotificationIntentInterceptor.EXTRA_PENDING_INTENT");
        if (pendingIntent == null) {
            return;
        }
        try {
            pendingIntent.send();
        } catch (PendingIntent.CanceledException e) {
            AbstractC4851eH1.a("IntentInterceptor", "The PendingIntent to fire is canceled.", new Object[0]);
            e.printStackTrace();
        }
    }

    public static PendingIntent b(int i, int i2, C7893n72 c7893n72, C4705dr2 c4705dr2) {
        int i3;
        PendingIntent pendingIntent;
        Intent intent;
        int d = AbstractC2281Ro1.d(false);
        if (c4705dr2 != null) {
            pendingIntent = c4705dr2.a;
            i3 = c4705dr2.b;
        } else {
            i3 = d;
            pendingIntent = null;
        }
        boolean z = i == 2;
        Context context = V60.a;
        if (z) {
            intent = new Intent(context, (Class<?>) NotificationIntentInterceptor$Receiver.class);
        } else {
            intent = new Intent(context, (Class<?>) NotificationIntentInterceptor$TrampolineActivity.class);
        }
        intent.setAction("notifications.NotificationIntentInterceptor.INTENT_ACTION");
        intent.putExtra("notifications.NotificationIntentInterceptor.EXTRA_PENDING_INTENT", pendingIntent);
        intent.putExtra("notifications.NotificationIntentInterceptor.EXTRA_INTENT_TYPE", i);
        intent.putExtra("notifications.NotificationIntentInterceptor.EXTRA_NOTIFICATION_TYPE", c7893n72.a);
        intent.putExtra("notifications.NotificationIntentInterceptor.EXTRA_CREATE_TIME", System.currentTimeMillis());
        if (i == 1) {
            intent.putExtra("notifications.NotificationIntentInterceptor.EXTRA_ACTION_TYPE", i2);
        }
        if (z && Build.VERSION.SDK_INT >= 24) {
            intent.addFlags(268435456);
        }
        int i4 = c4705dr2 != null ? c4705dr2.c : 0;
        int i5 = ((((c7893n72.a * 31) + i) * 31) + i2) * 31;
        String str = c7893n72.b;
        int hashCode = ((((i5 + (str != null ? str.hashCode() : 0)) * 31) + c7893n72.c) * 31) + i4;
        if (z) {
            return PendingIntent.getBroadcast(context, hashCode, intent, i3);
        }
        return PendingIntent.getActivity(context, hashCode, intent, i3);
    }
}
