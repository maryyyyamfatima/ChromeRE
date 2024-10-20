package com.google.vr.ndk.base;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import com.google.vr.sdk.common.deps.c;
import com.google.vr.sdk.proto.nano.CardboardDevice$DeviceParams;
import com.google.vr.sdk.proto.nano.Display$DisplayParams;
import com.google.vr.vrcore.logging.api.VREventParcelable;
import defpackage.AbstractC5729gq0;
import defpackage.C1586Mf1;
import defpackage.Qi4;
import defpackage.Si4;
import defpackage.Yh4;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public class SdkDaydreamTouchListener extends AbstractDaydreamTouchListener implements View.OnTouchListener {
    private final GvrApi gvrApi;
    private final GvrLayoutImpl gvrLayout;
    private final boolean isDaydreamImageAlignmentEnabled;
    private final Qi4 vrParamsProvider;

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes4.dex */
    public class FinishInitilizationTask extends AsyncTask {
        public Display display;

        private FinishInitilizationTask() {
        }

        @Override // android.os.AsyncTask
        public void onProgressUpdate(Void... voidArr) {
        }

        @Override // android.os.AsyncTask
        public Display$DisplayParams doInBackground(Void... voidArr) {
            return SdkDaydreamTouchListener.this.vrParamsProvider.c();
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Display$DisplayParams display$DisplayParams) {
            SdkDaydreamTouchListener.this.init(AbstractC5729gq0.d(this.display, display$DisplayParams), display$DisplayParams);
        }

        public /* synthetic */ FinishInitilizationTask(SdkDaydreamTouchListener sdkDaydreamTouchListener, AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes4.dex */
    public class RefreshViewerProfileTask extends AsyncTask {
        private RefreshViewerProfileTask() {
        }

        @Override // android.os.AsyncTask
        public void onProgressUpdate(Void... voidArr) {
        }

        @Override // android.os.AsyncTask
        public CardboardDevice$DeviceParams doInBackground(Void... voidArr) {
            return SdkDaydreamTouchListener.this.vrParamsProvider.a();
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(CardboardDevice$DeviceParams cardboardDevice$DeviceParams) {
            SdkDaydreamTouchListener.this.setDeviceParams(cardboardDevice$DeviceParams);
        }

        public /* synthetic */ RefreshViewerProfileTask(SdkDaydreamTouchListener sdkDaydreamTouchListener, AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public SdkDaydreamTouchListener(GvrLayoutImpl gvrLayoutImpl) {
        this.gvrLayout = gvrLayoutImpl;
        GvrApi gvrApi = gvrLayoutImpl.getGvrApi();
        this.gvrApi = gvrApi;
        this.isDaydreamImageAlignmentEnabled = (gvrApi.getSdkConfigurationParams().daydreamImageAlignment.intValue() == 1 || gvrApi.getSdkConfigurationParams().touchOverlayEnabled.booleanValue()) ? false : true;
        Context context = gvrLayoutImpl.getContext();
        this.vrParamsProvider = Si4.a(context);
        FinishInitilizationTask finishInitilizationTask = new FinishInitilizationTask();
        finishInitilizationTask.display = AbstractC5729gq0.b(context);
        finishInitilizationTask.execute(new Void[0]);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return handleTouch(motionEvent, 0.0f, 0.0f);
    }

    public void refreshViewerProfile() {
        new RefreshViewerProfileTask().execute(new Void[0]);
    }

    public void shutdown() {
        this.vrParamsProvider.close();
    }

    public void init(DisplayMetrics displayMetrics, Display$DisplayParams display$DisplayParams) {
        initWithDisplayParams(displayMetrics, display$DisplayParams);
        refreshViewerProfile();
    }

    @Override // com.google.vr.ndk.base.AbstractDaydreamTouchListener
    public boolean isDaydreamImageAlignmentEnabled() {
        return this.isDaydreamImageAlignmentEnabled;
    }

    @Override // com.google.vr.ndk.base.AbstractDaydreamTouchListener
    public void setLensOffset(float f, float f2, float f3) {
        this.gvrApi.setLensOffset(f, f2, 0.0f);
    }

    @Override // com.google.vr.ndk.base.AbstractDaydreamTouchListener
    public void logEvent(int i, Yh4 yh4) {
        if (this.gvrLayout.getVrCoreSdkClient() != null && this.gvrLayout.getVrCoreSdkClient().getLoggingService() != null) {
            VREventParcelable vREventParcelable = new VREventParcelable(yh4);
            try {
                C1586Mf1 c1586Mf1 = (C1586Mf1) this.gvrLayout.getVrCoreSdkClient().getLoggingService();
                Parcel obtainAndWriteInterfaceToken = c1586Mf1.obtainAndWriteInterfaceToken();
                c.a(obtainAndWriteInterfaceToken, vREventParcelable);
                c1586Mf1.transactOneway(2, obtainAndWriteInterfaceToken);
                return;
            } catch (RemoteException unused) {
                Log.w("SdkDaydreamTouchListener", "Unable to log alignment event");
                return;
            }
        }
        Log.w("SdkDaydreamTouchListener", "Unable to log alignment event; logging service not available.");
    }
}
