package defpackage;

import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Bt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0225Bt extends AbstractC7464lt {
    public static C0225Bt a;

    public static void b(int i, String str) {
        String str2;
        C0095At c0095At;
        SharedPreferences sharedPreferences = T60.a;
        Set<String> stringSet = sharedPreferences.getStringSet("bts_cached_uma", new HashSet());
        if (stringSet != null && stringSet.contains(null)) {
            stringSet.remove(null);
        }
        String str3 = str + ":" + i + ":";
        Iterator<String> it = stringSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                str2 = null;
                break;
            } else {
                str2 = it.next();
                if (str2.startsWith(str3)) {
                    break;
                }
            }
        }
        HashSet hashSet = new HashSet(stringSet);
        if (str2 != null) {
            c0095At = C0095At.a(str2);
            if (c0095At == null) {
                c0095At = new C0095At(i, 1, str);
            }
            hashSet.remove(str2);
            c0095At.c++;
        } else {
            c0095At = new C0095At(i, 1, str);
        }
        hashSet.add(c0095At.toString());
        Object obj = ThreadUtils.a;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (hashSet.contains(null)) {
            hashSet.remove(null);
        }
        edit.putStringSet("bts_cached_uma", hashSet);
        edit.apply();
    }

    public static C0225Bt c() {
        if (a == null) {
            a = new C0225Bt();
        }
        return a;
    }

    public static void d(int i, long j) {
        String str;
        StringBuilder sb = new StringBuilder("Android.BackgroundTaskScheduler.TaskFinished.");
        if (i == 1) {
            str = "Gcm";
        } else if (i == 2) {
            str = "ComponentUpdate";
        } else if (i == 21) {
            str = "NotificationService";
        } else if (i == 22) {
            str = "FeedRefresh";
        } else if (i == 42) {
            str = "WebviewMinidumpUploading";
        } else if (i == 43) {
            str = "ChromeMinidumpUploading";
        } else if (i == 83) {
            str = "WebviewVariationsSeedFetch";
        } else if (i == 91) {
            str = "WebApkUpdate";
        } else if (i == 110) {
            str = "WebviewComponentUpdate";
        } else if (i == 33656) {
            str = "Test";
        } else if (i != 71300) {
            switch (i) {
                case 53:
                    str = "DownloadService";
                    break;
                case 54:
                    str = "DownloadCleanup";
                    break;
                case 55:
                    str = "DeprecatedDownloadResumption";
                    break;
                case 56:
                    str = "DownloadAutoResumption";
                    break;
                case 57:
                    str = "DownloadLater";
                    break;
                default:
                    switch (i) {
                        case 77:
                            str = "OfflinePages";
                            break;
                        case 78:
                            str = "OfflinePagesPrefetch";
                            break;
                        case 79:
                            str = "OfflinePagesPrefetchNotification";
                            break;
                        default:
                            switch (i) {
                                case 100:
                                    str = "DeprecatedExploreSitesRefresh";
                                    break;
                                case 101:
                                    str = "ExploreSitesRefresh";
                                    break;
                                case 102:
                                    str = "BackgroundSyncOneShot";
                                    break;
                                case 103:
                                    str = "NotificationScheduler";
                                    break;
                                case 104:
                                    str = "NotificationTrigger";
                                    break;
                                case 105:
                                    str = "PeriodicBackgroundSyncChromeWakeup";
                                    break;
                                case 106:
                                    str = "QueryTile";
                                    break;
                                case 107:
                                    str = "FeedV2Refresh";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                    }
            }
        } else {
            str = "Omaha";
        }
        sb.append(str);
        EI2.g(sb.toString(), j, 1L, 86400000L, 50);
    }
}
