package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.media.MediaMetadata;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yR1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11768yR1 {
    public static int c;
    public final C9710sR1 a;
    public final ArrayList b = new ArrayList();

    public C11768yR1(Context context, String str) {
        ComponentName componentName;
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        int i = RM1.a;
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        PendingIntent pendingIntent = null;
        if (queryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
            componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
        } else {
            if (queryBroadcastReceivers.size() > 1) {
                Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
            }
            componentName = null;
        }
        if (componentName == null) {
            Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
        }
        if (componentName != null) {
            Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
            intent2.setComponent(componentName);
            pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            this.a = new C10739vR1(context, str);
        } else if (i2 >= 28) {
            this.a = new C10396uR1(context, str);
        } else {
            this.a = new C9710sR1(context, str);
        }
        d(new C7651mR1(), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
        this.a.h(pendingIntent);
        new C12091zN1(context, this);
        if (c == 0) {
            c = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
        }
    }

    public final void d(AbstractC8682pR1 abstractC8682pR1, Handler handler) {
        C9710sR1 c9710sR1 = this.a;
        if (abstractC8682pR1 == null) {
            c9710sR1.c(null, null);
            return;
        }
        if (handler == null) {
            handler = new Handler();
        }
        c9710sR1.c(abstractC8682pR1, handler);
    }

    public final void c(boolean z) {
        this.a.a.setActive(z);
        Iterator it = this.b.iterator();
        if (it.hasNext()) {
            ((AbstractC7646mQ1) it.next()).getClass();
            throw null;
        }
    }

    public final void f(PlaybackStateCompat playbackStateCompat) {
        C9710sR1 c9710sR1 = this.a;
        c9710sR1.g = playbackStateCompat;
        synchronized (c9710sR1.c) {
            int beginBroadcast = c9710sR1.f.beginBroadcast();
            while (true) {
                beginBroadcast--;
                if (beginBroadcast < 0) {
                    break;
                } else {
                    try {
                        ((InterfaceC12174zd1) c9710sR1.f.getBroadcastItem(beginBroadcast)).b1(playbackStateCompat);
                    } catch (RemoteException unused) {
                    }
                }
            }
            c9710sR1.f.finishBroadcast();
        }
        MediaSession mediaSession = c9710sR1.a;
        if (playbackStateCompat.q == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(playbackStateCompat.a, playbackStateCompat.g, playbackStateCompat.i, playbackStateCompat.m);
            builder.setBufferedPosition(playbackStateCompat.h);
            builder.setActions(playbackStateCompat.j);
            builder.setErrorMessage(playbackStateCompat.l);
            for (PlaybackStateCompat.CustomAction customAction : playbackStateCompat.n) {
                PlaybackState.CustomAction customAction2 = customAction.j;
                if (customAction2 == null) {
                    PlaybackState.CustomAction.Builder builder2 = new PlaybackState.CustomAction.Builder(customAction.a, customAction.g, customAction.h);
                    builder2.setExtras(customAction.i);
                    customAction2 = builder2.build();
                }
                builder.addCustomAction(customAction2);
            }
            builder.setActiveQueueItemId(playbackStateCompat.o);
            builder.setExtras(playbackStateCompat.p);
            playbackStateCompat.q = builder.build();
        }
        mediaSession.setPlaybackState(playbackStateCompat.q);
    }

    public final void e(MediaMetadataCompat mediaMetadataCompat) {
        C9710sR1 c9710sR1 = this.a;
        c9710sR1.h = mediaMetadataCompat;
        if (mediaMetadataCompat.g == null) {
            Parcel obtain = Parcel.obtain();
            mediaMetadataCompat.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            mediaMetadataCompat.g = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(obtain);
            obtain.recycle();
        }
        c9710sR1.a.setMetadata(mediaMetadataCompat.g);
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(C11768yR1.class.getClassLoader());
        }
    }

    public static Bundle g(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        a(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public static PlaybackStateCompat b(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long j = playbackStateCompat.g;
        long j2 = -1;
        if (j == -1) {
            return playbackStateCompat;
        }
        int i = playbackStateCompat.a;
        if (i != 3 && i != 4 && i != 5) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.m <= 0) {
            return playbackStateCompat;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = (playbackStateCompat.i * ((float) (elapsedRealtime - r6))) + j;
        if (mediaMetadataCompat != null) {
            Bundle bundle = mediaMetadataCompat.a;
            if (bundle.containsKey("android.media.metadata.DURATION")) {
                j2 = bundle.getLong("android.media.metadata.DURATION", 0L);
            }
        }
        long j4 = (j2 < 0 || j3 <= j2) ? j3 < 0 ? 0L : j3 : j2;
        ArrayList arrayList = new ArrayList();
        long j5 = playbackStateCompat.h;
        long j6 = playbackStateCompat.j;
        int i2 = playbackStateCompat.k;
        CharSequence charSequence = playbackStateCompat.l;
        ArrayList arrayList2 = playbackStateCompat.n;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        return new PlaybackStateCompat(playbackStateCompat.a, j4, j5, playbackStateCompat.i, j6, i2, charSequence, elapsedRealtime, arrayList, playbackStateCompat.o, playbackStateCompat.p);
    }
}
