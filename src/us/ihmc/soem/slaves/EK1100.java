package us.ihmc.soem.slaves;

import us.ihmc.soem.wrapper.Slave;

public class EK1100 extends Slave
{
   
   static final int vendorID = 0x00000002;
   static final int productCode = 0x044c2c52;

   public EK1100(int aliasAddress, int configAddress)
   {
      super(vendorID, productCode, aliasAddress, configAddress);
   }


   @Override
   protected void configure(boolean dcEnabled, long cycleTimeInNs)
   {
      if(dcEnabled)
      {
         configureDCSync0(true, cycleTimeInNs, 0);
      }
      else
      {
         configureDCSync0(false, 0, 0);
      }
   }
   
   @Override
   protected void shutdown()
   {
      // TODO Auto-generated method stub
      
   }

   @Override
   protected boolean hasShutdown()
   {
      return true;
   }

}
