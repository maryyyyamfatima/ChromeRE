package org.chromium.chrome.browser.media;

import J.N;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.PendingIntent;
import android.app.PictureInPictureParams;
import android.app.RemoteAction;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.util.Rational;
import android.util.Size;
import android.view.ViewGroup;
import com.android.chrome.R;
import defpackage.AbstractActivityC7416ll;
import defpackage.AbstractC7239lD3;
import defpackage.C10285u6;
import defpackage.C1403Ku2;
import defpackage.C1662Mu2;
import defpackage.C1792Nu2;
import defpackage.C6586jK3;
import defpackage.JM1;
import defpackage.V60;
import defpackage.ViewOnLayoutChangeListenerC1532Lu2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.chromium.base.ApplicationStatus;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.components.thinwebview.internal.CompositorViewImpl;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PictureInPictureActivity extends AbstractActivityC7416ll {
    public static long c0;
    public static final C1403Ku2 d0 = new C1403Ku2();
    public long T;
    public TabImpl U;
    public C1662Mu2 V;
    public CompositorViewImpl W;
    public boolean X;
    public final HashMap Y = new HashMap();
    public Rational Z;
    public int a0;
    public C1792Nu2 b0;

    @Override // defpackage.LC
    public final boolean o() {
        return true;
    }

    @Override // defpackage.AbstractActivityC7416ll
    public final void P0() {
        F0();
    }

    @Override // defpackage.AbstractActivityC7416ll, defpackage.LC
    public final void l() {
        super.l();
        C10285u6 c10285u6 = this.H;
        this.a0 = (int) (c10285u6.i.c.x * 0.9d);
        CompositorViewImpl compositorViewImpl = new CompositorViewImpl(this, c10285u6, new C6586jK3());
        this.W = compositorViewImpl;
        addContentView(compositorViewImpl.a, new ViewGroup.LayoutParams(-1, -1));
        this.W.a.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1532Lu2(this));
        N.MxJhtvhD(this.T, this.W);
    }

    @Override // defpackage.AbstractActivityC7416ll, androidx.appcompat.app.a, defpackage.VS0, android.app.Activity
    public final void onStart() {
        boolean z;
        super.onStart();
        Intent intent = getIntent();
        this.T = intent.getLongExtra("org.chromium.chrome.browser.media.PictureInPictureActivity.NativePointer", 0L);
        intent.setExtrasClassLoader(WebContents.class.getClassLoader());
        TabImpl tabImpl = (TabImpl) N.MMqeq$AW((WebContents) intent.getParcelableExtra("org.chromium.chrome.browser.media.PictureInPicture.WebContents"));
        this.U = tabImpl;
        if (this.T == c0) {
            if (tabImpl != null) {
                Iterator<ActivityManager.AppTask> it = ((ActivityManager) V60.a.getSystemService("activity")).getAppTasks().iterator();
                while (it.hasNext()) {
                    if (it.next().getTaskInfo().id == AbstractC7239lD3.b(this.U).getTaskId()) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                c0 = 0L;
                C1662Mu2 c1662Mu2 = new C1662Mu2(this);
                this.V = c1662Mu2;
                this.U.v(c1662Mu2);
                C1792Nu2 c1792Nu2 = new C1792Nu2(this);
                this.b0 = c1792Nu2;
                V60.d(this, c1792Nu2, new IntentFilter("org.chromium.chrome.browser.media.PictureInPictureActivity.MediaAction"));
                HashMap hashMap = this.Y;
                hashMap.put(0, Q0(0));
                hashMap.put(1, Q0(1));
                hashMap.put(2, Q0(2));
                hashMap.put(3, Q0(3));
                N.MjkqYLC6(this.T, this, this.H);
                Size size = new Size(intent.getIntExtra("org.chromium.chrome.browser.media.PictureInPictureActivity.source.width", 0), intent.getIntExtra("org.chromium.chrome.browser.media.PictureInPictureActivity.source.height", 0));
                if (size.getWidth() > 0 && size.getHeight() > 0) {
                    int width = size.getWidth();
                    int height = size.getHeight();
                    if (height != 0) {
                        float f = height;
                        width = (int) (JM1.b(width / f, 0.41841003f, 2.39f) * f);
                    }
                    this.Z = new Rational(width, height);
                }
                if (getIntent().hasExtra("com.android.chrome.pictureinpicture.launched")) {
                    return;
                }
                enterPictureInPictureMode(R0());
                return;
            }
        }
        finish();
    }

    @Override // defpackage.AbstractActivityC7416ll, androidx.appcompat.app.a, defpackage.VS0, android.app.Activity
    public final void onStop() {
        super.onStop();
        CompositorViewImpl compositorViewImpl = this.W;
        if (compositorViewImpl != null) {
            long j = compositorViewImpl.b;
            if (j != 0) {
                N.M_L66GG1(j, compositorViewImpl);
                compositorViewImpl.b = 0L;
            }
        }
    }

    @Override // defpackage.AbstractActivityC7416ll, defpackage.LM, androidx.appcompat.app.a, defpackage.VS0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C1792Nu2 c1792Nu2 = this.b0;
        if (c1792Nu2 != null) {
            unregisterReceiver(c1792Nu2);
            this.b0 = null;
        }
        TabImpl tabImpl = this.U;
        if (tabImpl != null) {
            tabImpl.w(this.V);
            this.U = null;
        }
        this.V = null;
    }

    @Override // defpackage.AbstractActivityC6817k00, android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        super.onPictureInPictureModeChanged(z, configuration);
        if (z) {
            return;
        }
        N.MCu7CiY_(this.T);
        finish();
    }

    @Override // defpackage.AbstractActivityC7416ll
    public final C10285u6 v0() {
        return new C10285u6(this, this.F);
    }

    public void close() {
        finish();
    }

    public final PictureInPictureParams R0() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = this.Y;
        arrayList.add((RemoteAction) hashMap.get(2));
        arrayList.add((RemoteAction) hashMap.get(Integer.valueOf(this.X ? 1 : 0)));
        arrayList.add((RemoteAction) hashMap.get(3));
        PictureInPictureParams.Builder builder = new PictureInPictureParams.Builder();
        builder.setActions(arrayList);
        builder.setAspectRatio(this.Z);
        return builder.build();
    }

    public final RemoteAction Q0(int i) {
        RemoteAction remoteAction;
        Intent intent = new Intent("org.chromium.chrome.browser.media.PictureInPictureActivity.MediaAction");
        intent.putExtra("org.chromium.chrome.browser.media.PictureInPictureActivity.ReceiverToken", this.b0.hashCode());
        intent.putExtra("org.chromium.chrome.browser.media.PictureInPictureActivity.ControlType", i);
        intent.putExtra("org.chromium.chrome.browser.media.PictureInPictureActivity.NativePointer", this.T);
        PendingIntent broadcast = PendingIntent.getBroadcast(getApplicationContext(), i, intent, 201326592);
        if (i == 0) {
            remoteAction = new RemoteAction(Icon.createWithResource(getApplicationContext(), R.drawable.f50020_resource_name_obfuscated_res_0x7f0902ff), getApplicationContext().getResources().getText(R.string.f66190_resource_name_obfuscated_res_0x7f140159), "", broadcast);
        } else if (i == 1) {
            remoteAction = new RemoteAction(Icon.createWithResource(getApplicationContext(), R.drawable.f49930_resource_name_obfuscated_res_0x7f0902f6), getApplicationContext().getResources().getText(R.string.f66170_resource_name_obfuscated_res_0x7f140157), "", broadcast);
        } else if (i != 2) {
            remoteAction = i != 3 ? null : new RemoteAction(Icon.createWithResource(getApplicationContext(), R.drawable.f50300_resource_name_obfuscated_res_0x7f09031f), getApplicationContext().getResources().getText(R.string.f66010_resource_name_obfuscated_res_0x7f140146), "", broadcast);
        } else {
            remoteAction = new RemoteAction(Icon.createWithResource(getApplicationContext(), R.drawable.f50310_resource_name_obfuscated_res_0x7f090320), getApplicationContext().getResources().getText(R.string.f66220_resource_name_obfuscated_res_0x7f14015c), "", broadcast);
        }
        remoteAction.setEnabled(false);
        return remoteAction;
    }

    public final void updateVideoSize(int i, int i2) {
        if (i2 != 0) {
            float f = i2;
            i = (int) (JM1.b(i / f, 0.41841003f, 2.39f) * f);
        }
        this.Z = new Rational(i, i2);
        setPictureInPictureParams(R0());
    }

    public final void setPlaybackState(boolean z) {
        this.X = z;
        setPictureInPictureParams(R0());
    }

    public final void updateVisibleActions(int[] iArr) {
        boolean isEnabled;
        boolean isEnabled2;
        HashSet hashSet = new HashSet();
        for (int i : iArr) {
            hashSet.add(Integer.valueOf(i));
        }
        HashMap hashMap = this.Y;
        for (Integer num : hashMap.keySet()) {
            RemoteAction remoteAction = (RemoteAction) hashMap.get(num);
            isEnabled = remoteAction.isEnabled();
            if (isEnabled != hashSet.contains(num)) {
                isEnabled2 = remoteAction.isEnabled();
                remoteAction.setEnabled(!isEnabled2);
            }
        }
        setPictureInPictureParams(R0());
    }

    public static void createActivity(long j, Object obj, int i, int i2, int i3, int i4) {
        long j2 = c0;
        if (j2 != 0) {
            N.MrWAWBMN(j2);
        }
        c0 = j;
        Tab tab = (Tab) obj;
        WindowAndroid m = tab.m();
        Bundle bundle = null;
        Context context = m != null ? (Context) m.k().get() : null;
        Context context2 = context != null ? context : V60.a;
        Intent intent = new Intent(context2, (Class<?>) PictureInPictureActivity.class);
        intent.putExtra("org.chromium.chrome.browser.media.PictureInPicture.WebContents", tab.b());
        intent.putExtra("org.chromium.chrome.browser.media.PictureInPictureActivity.NativePointer", j);
        intent.addFlags(268435456);
        if (i4 != 0) {
            float f = i4;
            i3 = (int) (JM1.b(i3 / f, 0.41841003f, 2.39f) * f);
        }
        if (i3 > 0 && i4 > 0) {
            Rect rect = new Rect(i, i2, i + i3, i2 + i4);
            if (context != null && rect.left >= 0 && rect.top >= 0) {
                bundle = d0.a(rect);
            }
            if (bundle != null) {
                intent.putExtra("com.android.chrome.pictureinpicture.launched", true);
            }
            intent.putExtra("org.chromium.chrome.browser.media.PictureInPictureActivity.source.width", i3);
            intent.putExtra("org.chromium.chrome.browser.media.PictureInPictureActivity.source.height", i4);
        }
        context2.startActivity(intent, bundle);
    }

    public static void onWindowDestroyed(long j) {
        if (j == c0) {
            c0 = 0L;
        }
        Iterator it = ApplicationStatus.b().iterator();
        while (it.hasNext()) {
            Activity activity = (Activity) it.next();
            if (activity instanceof PictureInPictureActivity) {
                PictureInPictureActivity pictureInPictureActivity = (PictureInPictureActivity) activity;
                if (j == pictureInPictureActivity.T) {
                    pictureInPictureActivity.T = 0L;
                    pictureInPictureActivity.finish();
                }
            }
        }
    }
}
