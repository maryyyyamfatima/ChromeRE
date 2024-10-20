package org.chromium.device.gamepad;

import J.N;
import android.hardware.input.InputManager;
import android.os.CombinedVibration;
import android.os.VibrationEffect;
import android.os.VibratorManager;
import android.view.InputDevice;
import android.view.KeyEvent;
import defpackage.AbstractC5274fX0;
import defpackage.C4587dX0;
import defpackage.C4930eX0;
import defpackage.C8024nX0;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class GamepadList {
    public InputManager c;
    public int d;
    public boolean e;
    public final Object a = new Object();
    public final C4587dX0[] b = new C4587dX0[4];
    public final C4930eX0 f = new C4930eX0(this);

    public final C4587dX0 a(int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            C4587dX0 c4587dX0 = this.b[i2];
            if (c4587dX0 != null && c4587dX0.a == i) {
                return c4587dX0;
            }
        }
        return null;
    }

    public final void d(InputDevice inputDevice) {
        C4587dX0[] c4587dX0Arr;
        int i = 0;
        while (true) {
            c4587dX0Arr = this.b;
            if (i >= 4) {
                i = -1;
                break;
            } else if (c4587dX0Arr[i] == null) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        c4587dX0Arr[i] = new C4587dX0(i, inputDevice);
    }

    public static boolean b(InputDevice inputDevice) {
        return (inputDevice == null || Objects.equals(inputDevice.getName(), "uinput-fpc") || (inputDevice.getSources() & 16777232) != 16777232) ? false : true;
    }

    public static boolean c(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 130) {
            switch (keyCode) {
                case 19:
                case 20:
                case 21:
                case 22:
                    break;
                default:
                    int scanCode = keyEvent.getScanCode();
                    if (keyCode != 0 || scanCode < 704 || scanCode > 719) {
                        return KeyEvent.isGamepadButton(keyCode);
                    }
                    return true;
            }
        }
        return true;
    }

    public static void setGamepadAPIActive(boolean z) {
        GamepadList gamepadList = AbstractC5274fX0.a;
        synchronized (gamepadList.a) {
            gamepadList.e = z;
            if (z) {
                for (int i = 0; i < 4; i++) {
                    C4587dX0 c4587dX0 = gamepadList.b[i];
                    if (c4587dX0 != null) {
                        Arrays.fill(c4587dX0.f, 0.0f);
                        Arrays.fill(c4587dX0.i, 0.0f);
                        Arrays.fill(c4587dX0.g, 0.0f);
                        Arrays.fill(c4587dX0.h, 0.0f);
                    }
                }
            }
        }
    }

    public static void setVibration(int i, double d, double d2) {
        C4587dX0 c4587dX0;
        CombinedVibration.ParallelCombination startParallel;
        CombinedVibration combine;
        VibrationEffect createOneShot;
        VibrationEffect createOneShot2;
        GamepadList gamepadList = AbstractC5274fX0.a;
        synchronized (gamepadList.a) {
            c4587dX0 = gamepadList.b[i];
        }
        c4587dX0.getClass();
        int round = (int) Math.round(Math.max(0.0d, Math.min(1.0d, d)) * 255.0d);
        int round2 = (int) Math.round(Math.max(0.0d, Math.min(1.0d, d2)) * 255.0d);
        if (round != 0 || round2 != 0) {
            startParallel = CombinedVibration.startParallel();
            if (round > 0) {
                createOneShot2 = VibrationEffect.createOneShot(5000L, round);
                startParallel.addVibrator(0, createOneShot2);
            }
            if (round2 > 0) {
                createOneShot = VibrationEffect.createOneShot(5000L, round2);
                startParallel.addVibrator(1, createOneShot);
            }
            VibratorManager vibratorManager = c4587dX0.n;
            combine = startParallel.combine();
            vibratorManager.vibrate(combine);
            return;
        }
        c4587dX0.n.cancel();
    }

    public static void setZeroVibration(int i) {
        C4587dX0 c4587dX0;
        GamepadList gamepadList = AbstractC5274fX0.a;
        synchronized (gamepadList.a) {
            c4587dX0 = gamepadList.b[i];
        }
        c4587dX0.n.cancel();
    }

    public static void updateGamepadData(long j) {
        Object obj;
        Throwable th;
        int i;
        GamepadList gamepadList = AbstractC5274fX0.a;
        Object obj2 = gamepadList.a;
        synchronized (obj2) {
            int i2 = 0;
            while (i2 < 4) {
                try {
                    C4587dX0 c4587dX0 = gamepadList.b[i2];
                    if (c4587dX0 != null) {
                        c4587dX0.l.j(c4587dX0.f, c4587dX0.g, c4587dX0.i, c4587dX0.h);
                        c4587dX0.l.getClass();
                        i = i2;
                        obj = obj2;
                        try {
                            N.MOkngxPY(gamepadList, j, i2, !(r2 instanceof C8024nX0), true, c4587dX0.j, c4587dX0.c, c4587dX0.d, c4587dX0.e, c4587dX0.f, c4587dX0.g, c4587dX0.l.i(), c4587dX0.m);
                        } catch (Throwable th2) {
                            th = th2;
                            while (true) {
                                try {
                                    break;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                            throw th;
                        }
                    } else {
                        i = i2;
                        obj = obj2;
                        N.MOkngxPY(gamepadList, j, i, false, false, null, 0, 0, 0L, null, null, 0, false);
                    }
                    i2 = i + 1;
                    obj2 = obj;
                } catch (Throwable th4) {
                    th = th4;
                    obj = obj2;
                    while (true) {
                        break;
                        break;
                    }
                    throw th;
                }
            }
            obj = obj2;
        }
    }
}
