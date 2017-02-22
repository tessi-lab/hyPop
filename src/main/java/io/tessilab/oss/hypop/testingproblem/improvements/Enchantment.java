/*
 * Copyright 2017 Tessi lab.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.tessilab.oss.hypop.testingproblem.improvements;

/**
 * They only add a flat to the weapon
 * @author Andres BEL ALONSO
 */
public abstract class Enchantment extends Improvement{
    
    public Enchantment(int ad, int ap, int health, int attackspeed, int mr, int ar) {
        super(ad, ap, health, attackspeed, mr, ar, 0, 0, 0, 0, 0, 0);
    }
    
}
