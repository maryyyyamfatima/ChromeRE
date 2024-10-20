package defpackage;

import android.hardware.input.InputManager;
import android.view.InputDevice;
import org.chromium.device.gamepad.GamepadList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eX0 */
/* loaded from: classes2.dex */
public final class C4930eX0 implements InputManager.InputDeviceListener {
    public final /* synthetic */ GamepadList a;

    public C4930eX0(GamepadList gamepadList) {
        this.a = gamepadList;
    }

    @Override // android.hardware.input.InputManager.InputDeviceListener
    public final void onInputDeviceChanged(int i) {
        GamepadList gamepadList = this.a;
        gamepadList.getClass();
        InputDevice device = InputDevice.getDevice(i);
        if (GamepadList.b(device)) {
            synchronized (gamepadList.a) {
                C4587dX0 a = gamepadList.a(device.getId());
                if (a != null) {
                    gamepadList.b[a.b] = null;
                }
                gamepadList.d(device);
            }
        }
    }

    @Override // android.hardware.input.InputManager.InputDeviceListener
    public final void onInputDeviceRemoved(int i) {
        GamepadList gamepadList = this.a;
        synchronized (gamepadList.a) {
            C4587dX0 a = gamepadList.a(i);
            if (a != null) {
                gamepadList.b[a.b] = null;
            }
        }
    }

    @Override // android.hardware.input.InputManager.InputDeviceListener
    public final void onInputDeviceAdded(int i) {
        GamepadList gamepadList = this.a;
        gamepadList.getClass();
        InputDevice device = InputDevice.getDevice(i);
        if (GamepadList.b(device)) {
            synchronized (gamepadList.a) {
                gamepadList.d(device);
            }
        }
    }
}
