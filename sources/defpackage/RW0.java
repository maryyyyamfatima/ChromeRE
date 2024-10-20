package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.hardware.input.InputManager;
import android.view.InputDevice;
import org.chromium.content.browser.webcontents.WebContentsImpl;
import org.chromium.device.gamepad.GamepadList;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class RW0 implements InterfaceC9163qp4, J44 {
    public final Context a;

    @Override // defpackage.InterfaceC9163qp4
    public final /* synthetic */ void a(WindowAndroid windowAndroid) {
    }

    @Override // defpackage.InterfaceC1765Np0
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.J44
    public final /* synthetic */ void destroy() {
    }

    @Override // defpackage.InterfaceC9163qp4
    public final /* synthetic */ void g(boolean z, boolean z2) {
    }

    @Override // defpackage.InterfaceC1765Np0
    public final /* synthetic */ void l(float f) {
    }

    @Override // defpackage.InterfaceC1765Np0
    public final /* synthetic */ void m(int i) {
    }

    @Override // defpackage.InterfaceC1765Np0
    public final /* synthetic */ void n() {
    }

    @Override // defpackage.InterfaceC9163qp4
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // defpackage.InterfaceC9163qp4
    public final /* synthetic */ void onWindowFocusChanged(boolean z) {
    }

    @Override // defpackage.InterfaceC1765Np0
    public final /* synthetic */ void p(float f) {
    }

    public RW0(WebContentsImpl webContentsImpl) {
        this.a = webContentsImpl.t();
        C10191tp4.e(webContentsImpl).b(this);
    }

    @Override // defpackage.InterfaceC9163qp4
    public final void onAttachedToWindow() {
        Context context = this.a;
        GamepadList gamepadList = AbstractC5274fX0.a;
        int i = gamepadList.d;
        gamepadList.d = i + 1;
        if (i == 0) {
            gamepadList.c = (InputManager) context.getSystemService("input");
            synchronized (gamepadList.a) {
                for (int i2 : gamepadList.c.getInputDeviceIds()) {
                    InputDevice device = InputDevice.getDevice(i2);
                    if (GamepadList.b(device)) {
                        gamepadList.d(device);
                    }
                }
            }
            gamepadList.c.registerInputDeviceListener(gamepadList.f, null);
        }
    }

    @Override // defpackage.InterfaceC9163qp4
    public final void onDetachedFromWindow() {
        GamepadList gamepadList = AbstractC5274fX0.a;
        int i = gamepadList.d - 1;
        gamepadList.d = i;
        if (i == 0) {
            synchronized (gamepadList.a) {
                for (int i2 = 0; i2 < 4; i2++) {
                    gamepadList.b[i2] = null;
                }
            }
            gamepadList.c.unregisterInputDeviceListener(gamepadList.f);
            gamepadList.c = null;
        }
    }

    public static RW0 b(WebContentsImpl webContentsImpl) {
        J44 j44;
        K44 x;
        if (webContentsImpl.p && (x = webContentsImpl.x()) != null) {
            J44 b = x.b(RW0.class);
            if (b == null) {
                b = x.d(RW0.class, new RW0(webContentsImpl));
            }
            j44 = (J44) RW0.class.cast(b);
        } else {
            j44 = null;
        }
        return (RW0) j44;
    }
}
