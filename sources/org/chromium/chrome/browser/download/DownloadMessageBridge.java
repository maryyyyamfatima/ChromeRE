package org.chromium.chrome.browser.download;

import J.N;
import android.content.Context;
import com.android.chrome.R;
import defpackage.AbstractC2884Wf;
import defpackage.C1910Os0;
import defpackage.C5265fV1;
import defpackage.EI2;
import defpackage.HU1;
import defpackage.InterfaceC0079Ap3;
import defpackage.V60;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.download.DownloadMessageBridge;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class DownloadMessageBridge {
    public long a;

    public DownloadMessageBridge(long j) {
        this.a = j;
    }

    public static DownloadMessageBridge create(long j) {
        return new DownloadMessageBridge(j);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Ds0] */
    public void showIncognitoDownloadMessage(final long j) {
        C1910Os0 c1910Os0 = DownloadManagerService.i().n;
        final ?? r1 = new Callback() { // from class: Ds0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                DownloadMessageBridge downloadMessageBridge = DownloadMessageBridge.this;
                downloadMessageBridge.getClass();
                N.MQ2U3zKT(downloadMessageBridge.a, j, ((Boolean) obj).booleanValue());
            }
        };
        c1910Os0.getClass();
        Context context = V60.a;
        PropertyModel propertyModel = new PropertyModel(PropertyModel.e(HU1.F));
        propertyModel.o(HU1.f, context.getString(R.string.f74930_resource_name_obfuscated_res_0x7f140528));
        propertyModel.o(HU1.h, context.getString(R.string.f74920_resource_name_obfuscated_res_0x7f140527));
        propertyModel.o(HU1.c, context.getString(R.string.f74910_resource_name_obfuscated_res_0x7f140526));
        propertyModel.o(HU1.l, AbstractC2884Wf.a(context, R.drawable.f48170_resource_name_obfuscated_res_0x7f09023f));
        propertyModel.o(HU1.d, new InterfaceC0079Ap3() { // from class: Gs0
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                r1.onResult(Boolean.TRUE);
                EI2.h(1, 5, "Download.Incognito.Message");
                return 1;
            }
        });
        propertyModel.o(HU1.x, new Callback() { // from class: Hs0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Integer num = (Integer) obj;
                if (num.intValue() == 3) {
                    EI2.h(3, 5, "Download.Incognito.Message");
                } else if (num.intValue() == 4) {
                    EI2.h(2, 5, "Download.Incognito.Message");
                } else {
                    EI2.h(4, 5, "Download.Incognito.Message");
                }
                r1.onResult(Boolean.FALSE);
            }
        });
        ((C5265fV1) c1910Os0.i()).c(propertyModel, true);
        EI2.h(0, 5, "Download.Incognito.Message");
    }

    public final void destroy() {
        this.a = 0L;
    }
}
