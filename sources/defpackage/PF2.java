package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.hardware.Camera;
import android.net.Uri;
import android.os.Process;
import android.util.SparseArray;
import android.webkit.URLUtil;
import com.android.chrome.R;
import com.google.android.gms.vision.barcode.Barcode;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import org.chromium.chrome.browser.document.ChromeLauncherActivity;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class PF2 implements Camera.PreviewCallback {
    public final Context a;
    public final PropertyModel b;
    public final EF2 c;
    public final A5 d;
    public C4034bu e;
    public ZN3 f;
    public final WindowAndroid g;

    public PF2(Activity activity, PropertyModel propertyModel, EF2 ef2, WindowAndroid windowAndroid) {
        this.a = activity;
        this.b = propertyModel;
        this.d = new A5(new WeakReference(activity));
        a();
        this.c = ef2;
        this.g = windowAndroid;
        this.e = null;
        new OF2(this).c(AbstractC0185Bl.e);
    }

    public final void a() {
        LD2 ld2 = WF2.b;
        boolean booleanValue = Boolean.valueOf(this.d.canRequestPermission("android.permission.CAMERA")).booleanValue();
        PropertyModel propertyModel = this.b;
        propertyModel.k(ld2, booleanValue);
        propertyModel.k(WF2.a, Boolean.valueOf(this.a.checkPermission("android.permission.CAMERA", Process.myPid(), Process.myUid()) == 0).booleanValue());
    }

    @Override // android.hardware.Camera.PreviewCallback
    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        if (this.e == null) {
            return;
        }
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length);
        allocate.put(bArr);
        C8009nU0 c8009nU0 = new C8009nU0();
        int i = camera.getParameters().getPreviewSize().width;
        int i2 = camera.getParameters().getPreviewSize().height;
        if (allocate.capacity() < i * i2) {
            throw new IllegalArgumentException("Invalid image data size.");
        }
        c8009nU0.b = allocate;
        C7665mU0 c7665mU0 = c8009nU0.a;
        c7665mU0.a = i;
        c7665mU0.b = i2;
        c7665mU0.c = 17;
        SparseArray a = this.e.a(c8009nU0);
        if (this.b.j(WF2.c)) {
            if (a.size() == 0) {
                camera.setOneShotPreviewCallback(this);
                return;
            }
            Barcode barcode = (Barcode) a.valueAt(0);
            boolean isValidUrl = URLUtil.isValidUrl(barcode.g);
            Context context = this.a;
            String str = barcode.g;
            if (!isValidUrl) {
                String string = context.getString(R.string.f83930_resource_name_obfuscated_res_0x7f14091a, str);
                ZN3 zn3 = this.f;
                if (zn3 != null) {
                    zn3.a();
                }
                ZN3 c = ZN3.c(context, string, 1);
                this.f = c;
                c.d();
                FI2.a("SharingQRCode.ScannedNonURL");
                camera.setOneShotPreviewCallback(this);
                return;
            }
            Intent putExtra = new Intent().setAction("android.intent.action.VIEW").setData(Uri.parse(str)).setClass(context, ChromeLauncherActivity.class).addFlags(268959744).putExtra("com.android.browser.application_id", context.getPackageName()).putExtra("REUSE_URL_MATCHING_TAB_ELSE_NEW_TAB", true);
            AbstractC2281Ro1.a(putExtra);
            context.startActivity(putExtra);
            this.c.a.dismiss();
            FI2.a("SharingQRCode.ScannedURL");
        }
    }
}
