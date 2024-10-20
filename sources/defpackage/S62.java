package defpackage;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class S62 {
    public final Context a;
    public final Notification.Builder b;
    public final K62 c;
    public final RemoteViews d;
    public final RemoteViews e;
    public final Bundle f;
    public final int g;

    public S62(K62 k62) {
        String str;
        String str2;
        Notification notification;
        ArrayList arrayList;
        Throwable th;
        ArrayList arrayList2;
        String str3;
        String str4;
        Notification notification2;
        ArrayList arrayList3;
        Bundle[] bundleArr;
        int i;
        Set set;
        int i2;
        S62 s62 = this;
        new ArrayList();
        s62.f = new Bundle();
        s62.c = k62;
        Context context = k62.a;
        s62.a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            s62.b = new Notification.Builder(context, k62.B);
        } else {
            s62.b = new Notification.Builder(context);
        }
        Notification notification3 = k62.E;
        ArrayList arrayList4 = null;
        int i3 = 0;
        s62.b.setWhen(notification3.when).setSmallIcon(notification3.icon, notification3.iconLevel).setContent(notification3.contentView).setTicker(notification3.tickerText, null).setVibrate(notification3.vibrate).setLights(notification3.ledARGB, notification3.ledOnMS, notification3.ledOffMS).setOngoing((notification3.flags & 2) != 0).setOnlyAlertOnce((notification3.flags & 8) != 0).setAutoCancel((notification3.flags & 16) != 0).setDefaults(notification3.defaults).setContentTitle(k62.e).setContentText(k62.f).setContentInfo(k62.i).setContentIntent(k62.g).setDeleteIntent(notification3.deleteIntent).setFullScreenIntent(null, (notification3.flags & 128) != 0).setLargeIcon(k62.h).setNumber(k62.j).setProgress(k62.o, k62.p, k62.q);
        s62.b.setSubText(k62.n).setUsesChronometer(false).setPriority(k62.k);
        Iterator it = k62.b.iterator();
        while (true) {
            str = "";
            str2 = "android.support.allowGeneratedReplies";
            if (!it.hasNext()) {
                break;
            }
            F62 f62 = (F62) it.next();
            if (f62.b == null && (i2 = f62.h) != 0) {
                f62.b = IconCompat.b(null, "", i2);
            }
            IconCompat iconCompat = f62.b;
            Notification.Action.Builder builder = new Notification.Action.Builder(iconCompat != null ? iconCompat.g(null) : null, f62.i, f62.j);
            C7283lM2[] c7283lM2Arr = f62.c;
            if (c7283lM2Arr != null) {
                int length = c7283lM2Arr.length;
                RemoteInput[] remoteInputArr = new RemoteInput[length];
                while (i3 < c7283lM2Arr.length) {
                    C7283lM2 c7283lM2 = c7283lM2Arr[i3];
                    RemoteInput.Builder addExtras = new RemoteInput.Builder(c7283lM2.a).setLabel(c7283lM2.b).setChoices(null).setAllowFreeFormInput(c7283lM2.c).addExtras(c7283lM2.d);
                    if (Build.VERSION.SDK_INT >= 26 && (set = c7283lM2.e) != null) {
                        Iterator it2 = set.iterator();
                        while (it2.hasNext()) {
                            addExtras.setAllowDataType((String) it2.next(), true);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        addExtras.setEditChoicesBeforeSending(0);
                    }
                    remoteInputArr[i3] = addExtras.build();
                    i3++;
                }
                for (int i4 = 0; i4 < length; i4++) {
                    builder.addRemoteInput(remoteInputArr[i4]);
                }
            }
            Bundle bundle = f62.a;
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            boolean z = f62.d;
            bundle2.putBoolean("android.support.allowGeneratedReplies", z);
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 24) {
                builder.setAllowGeneratedReplies(z);
            }
            int i6 = f62.f;
            bundle2.putInt("android.support.action.semanticAction", i6);
            if (i5 >= 28) {
                builder.setSemanticAction(i6);
            }
            if (i5 >= 29) {
                builder.setContextual(f62.g);
            }
            if (i5 >= 31) {
                builder.setAuthenticationRequired(f62.k);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", f62.e);
            builder.addExtras(bundle2);
            s62.b.addAction(builder.build());
            i3 = 0;
        }
        Bundle bundle3 = k62.v;
        if (bundle3 != null) {
            s62.f.putAll(bundle3);
        }
        int i7 = Build.VERSION.SDK_INT;
        s62.d = k62.z;
        s62.e = k62.A;
        s62.b.setShowWhen(k62.l);
        s62.b.setLocalOnly(k62.t).setGroup(k62.r).setGroupSummary(k62.s).setSortKey(null);
        s62.g = 0;
        s62.b.setCategory(k62.u).setColor(k62.w).setVisibility(k62.x).setPublicVersion(k62.y).setSound(notification3.sound, notification3.audioAttributes);
        ArrayList arrayList5 = k62.c;
        ArrayList arrayList6 = k62.H;
        if (i7 < 28) {
            if (arrayList5 != null) {
                ArrayList arrayList7 = new ArrayList(arrayList5.size());
                Iterator it3 = arrayList5.iterator();
                if (it3.hasNext()) {
                    X5.a(it3.next());
                    throw null;
                }
                arrayList4 = arrayList7;
            }
            if (arrayList4 != null) {
                if (arrayList6 == null) {
                    arrayList6 = arrayList4;
                } else {
                    C5348fk c5348fk = new C5348fk(arrayList6.size() + arrayList4.size());
                    c5348fk.addAll(arrayList4);
                    c5348fk.addAll(arrayList6);
                    arrayList6 = new ArrayList(c5348fk);
                }
            }
        }
        if (arrayList6 != null && !arrayList6.isEmpty()) {
            Iterator it4 = arrayList6.iterator();
            while (it4.hasNext()) {
                s62.b.addPerson((String) it4.next());
            }
        }
        ArrayList arrayList8 = k62.d;
        if (arrayList8.size() > 0) {
            if (k62.v == null) {
                k62.v = new Bundle();
            }
            Bundle bundle4 = k62.v.getBundle("android.car.EXTENSIONS");
            bundle4 = bundle4 == null ? new Bundle() : bundle4;
            Bundle bundle5 = new Bundle(bundle4);
            Bundle bundle6 = new Bundle();
            int i8 = 0;
            while (i8 < arrayList8.size()) {
                String num = Integer.toString(i8);
                F62 f622 = (F62) arrayList8.get(i8);
                Object obj = T62.a;
                Bundle bundle7 = new Bundle();
                if (f622.b != null || (i = f622.h) == 0) {
                    arrayList2 = arrayList8;
                } else {
                    arrayList2 = arrayList8;
                    f622.b = IconCompat.b(null, str, i);
                }
                IconCompat iconCompat2 = f622.b;
                bundle7.putInt("icon", iconCompat2 != null ? iconCompat2.c() : 0);
                bundle7.putCharSequence("title", f622.i);
                bundle7.putParcelable("actionIntent", f622.j);
                Bundle bundle8 = f622.a;
                Bundle bundle9 = bundle8 != null ? new Bundle(bundle8) : new Bundle();
                bundle9.putBoolean(str2, f622.d);
                bundle7.putBundle("extras", bundle9);
                C7283lM2[] c7283lM2Arr2 = f622.c;
                if (c7283lM2Arr2 == null) {
                    bundleArr = null;
                    notification2 = notification3;
                    arrayList3 = arrayList5;
                    str3 = str;
                    str4 = str2;
                } else {
                    str3 = str;
                    Bundle[] bundleArr2 = new Bundle[c7283lM2Arr2.length];
                    str4 = str2;
                    int i9 = 0;
                    notification2 = notification3;
                    while (i9 < c7283lM2Arr2.length) {
                        C7283lM2 c7283lM22 = c7283lM2Arr2[i9];
                        C7283lM2[] c7283lM2Arr3 = c7283lM2Arr2;
                        Bundle bundle10 = new Bundle();
                        ArrayList arrayList9 = arrayList5;
                        bundle10.putString("resultKey", c7283lM22.a);
                        bundle10.putCharSequence("label", c7283lM22.b);
                        bundle10.putCharSequenceArray("choices", null);
                        bundle10.putBoolean("allowFreeFormInput", c7283lM22.c);
                        bundle10.putBundle("extras", c7283lM22.d);
                        Set set2 = c7283lM22.e;
                        if (set2 != null && !set2.isEmpty()) {
                            ArrayList<String> arrayList10 = new ArrayList<>(set2.size());
                            Iterator it5 = set2.iterator();
                            while (it5.hasNext()) {
                                arrayList10.add((String) it5.next());
                            }
                            bundle10.putStringArrayList("allowedDataTypes", arrayList10);
                        }
                        bundleArr2[i9] = bundle10;
                        i9++;
                        c7283lM2Arr2 = c7283lM2Arr3;
                        arrayList5 = arrayList9;
                    }
                    arrayList3 = arrayList5;
                    bundleArr = bundleArr2;
                }
                bundle7.putParcelableArray("remoteInputs", bundleArr);
                bundle7.putBoolean("showsUserInterface", f622.e);
                bundle7.putInt("semanticAction", f622.f);
                bundle6.putBundle(num, bundle7);
                i8++;
                arrayList8 = arrayList2;
                str = str3;
                notification3 = notification2;
                str2 = str4;
                arrayList5 = arrayList3;
            }
            notification = notification3;
            arrayList = arrayList5;
            bundle4.putBundle("invisible_actions", bundle6);
            bundle5.putBundle("invisible_actions", bundle6);
            if (k62.v == null) {
                k62.v = new Bundle();
            }
            k62.v.putBundle("android.car.EXTENSIONS", bundle4);
            s62 = this;
            s62.f.putBundle("android.car.EXTENSIONS", bundle5);
        } else {
            notification = notification3;
            arrayList = arrayList5;
        }
        int i10 = Build.VERSION.SDK_INT;
        Icon icon = k62.G;
        if (icon != null) {
            s62.b.setSmallIcon(icon);
        }
        if (i10 >= 24) {
            s62.b.setExtras(k62.v).setRemoteInputHistory(null);
            RemoteViews remoteViews = k62.z;
            if (remoteViews != null) {
                s62.b.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = k62.A;
            if (remoteViews2 != null) {
                s62.b.setCustomBigContentView(remoteViews2);
            }
        }
        if (i10 >= 26) {
            th = null;
            s62.b.setBadgeIconType(0).setSettingsText(null).setShortcutId(null).setTimeoutAfter(k62.C).setGroupAlertBehavior(0);
            if (!TextUtils.isEmpty(k62.B)) {
                s62.b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        } else {
            th = null;
        }
        if (i10 >= 28) {
            Iterator it6 = arrayList.iterator();
            if (it6.hasNext()) {
                X5.a(it6.next());
                throw th;
            }
        }
        if (i10 >= 29) {
            s62.b.setAllowSystemGeneratedContextualActions(k62.D);
            s62.b.setBubbleMetadata(null);
        }
        if (k62.F) {
            if (s62.c.s) {
                s62.g = 2;
            } else {
                s62.g = 1;
            }
            s62.b.setVibrate(null);
            s62.b.setSound(null);
            Notification notification4 = notification;
            int i11 = notification4.defaults & (-2) & (-3);
            notification4.defaults = i11;
            s62.b.setDefaults(i11);
            if (i10 >= 26) {
                if (TextUtils.isEmpty(s62.c.r)) {
                    s62.b.setGroup("silent");
                }
                s62.b.setGroupAlertBehavior(s62.g);
            }
        }
    }

    public static void a(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults = notification.defaults & (-2) & (-3);
    }
}
